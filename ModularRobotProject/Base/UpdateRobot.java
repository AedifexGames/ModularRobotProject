package Base;
import Extensions.Timers.*;
import Delegates.*;
public class UpdateRobot extends BaseRobot
{
    //#region Variables
    public static RobotTimer updateCycle = new RobotTimer();
    private static long updateInterval = (long) 0.1;
    public static int i = 120;
    //#endregion
    public static void main(String[] args) {
        Initialization();
    }
    protected static void Initialization(){
        BaseRobot.Initialization();
        updateCycle.timerLength = updateInterval;
        updateCycle.completionEvent = new UpdateDelegate();
        updateCycle.StartTimer();
    }
    public static void Update(){
        System.out.println(("Update"));
    }
    
}
