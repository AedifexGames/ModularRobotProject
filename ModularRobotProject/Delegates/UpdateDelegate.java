package Delegates;
import Extensions.IDelegate;
public class UpdateDelegate implements IDelegate{
    public void Invokable(){
        Base.UpdateRobot.Update();
        Base.UpdateRobot.updateCycle.StartTimer();
    }
}