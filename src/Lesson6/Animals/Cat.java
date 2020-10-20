package Lesson6.Animals;

public class Cat extends Animal {

    public Cat(String name, String color, int age, int rundistance, int swimdistance) {
        super(name, color, age, rundistance, swimdistance);

    }

    public void runCat() {
        if (this.rundistance <= 200) {
            System.out.println(name + " run " + rundistance + "m!");
        } else {
            System.out.println(name + " can't run so far!");
        }
    }

    public void swimCat() {
        System.out.println(name + " can't swim!");
    }

    @Override
    public void runDog() {

    }

    @Override
    public void swimDog() {

    }

}
