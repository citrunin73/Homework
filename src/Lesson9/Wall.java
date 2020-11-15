package Lesson9;
import Lesson9.Distance;

public class Wall implements Obstacles{
    @Override
    public void doIt(Distance c){
        c.jump();
    };

}