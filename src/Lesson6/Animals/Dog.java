package Lesson6.Animals;

public class Dog extends Animal {

    public Dog(String name, String color, int age, int rundistance, int swimdistance) {
        super(name, color, age, rundistance, swimdistance);
    }

    public void runDog() {
        if (this.rundistance <= 500) {
            System.out.println(name + " run " + rundistance + "m!");
        } else {
            System.out.println(name + " can't run so far!");
        }
    }

    public void swimDog() {
        if (this.swimdistance <= 10) {
            System.out.println(name + " swim " + swimdistance + "m!");
        } else {
            System.out.println(name + " can't swim so far!");
        }
    }

    @Override
    public void runCat() {

    }

    @Override
    public void swimCat() {

    }
}
