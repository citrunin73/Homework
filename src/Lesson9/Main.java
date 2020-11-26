package Lesson9;
import Lesson9.Obstacles;
import Lesson9.Distance;
import Lesson9.Cat;
import Lesson9.Human;
import Lesson9.Robot;
import Lesson9.Wall;
import Lesson9.RunningTrack;


public class Main {
    public static void main(String[] args) {
        Distance[] distances = {
                new Human("John"),
                new Cat("Barsik"),
                new Human("Jack"),
                new Robot("Iron")
        };
        Obstacles[] obstacles = {
                new Wall(),
                new RunningTrack()

        };
        for (Distance c : distances){
            for (Obstacles a: obstacles){
                a.doIt(c);
            }
        }


    }
}
