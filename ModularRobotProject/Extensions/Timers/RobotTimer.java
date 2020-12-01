package Extensions.Timers;
import Extensions.IDelegate;
import java.util.*;

public class RobotTimer {
    public long timerLength;
    private long currentTime;
    public boolean done = false;
    private Timer timer = new Timer("Timer");
    public IDelegate completionEvent;
    // Starts the Timer
    public void StartTimer() {
        done = false;
        TimerTask task = new TimerTask() {
            public void run() {
                EndTimer();
            }
        };
        timer.schedule(task, timerLength);
    }

    // Stops the Timer
    public void Pause() {
        try {
            timer.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    //Stops the Timer for X seconds
    public void TempStopTimer(long seconds){
        try {
            timer.wait(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    //Turns the Timer off
    public void ResetTimer(){
        timer.cancel();
    }
    //Runs the timer
    public void EndTimer(){
        done = true;
        completionEvent.Invokable();
    }
    //Returns the number of seconds left on the timer
    public float GetCurrentTime(){
        return currentTime;
    }
    //Returns the number of seconds the timer has been running
    public float GetRunTime(){
        return timerLength - currentTime;
    }
}