package Lesson9;
import Lesson9.Distance;

public class RunningTrack implements Obstacles{
    @Override
    public void doIt(Distance c){
        c.run();
    };

}
