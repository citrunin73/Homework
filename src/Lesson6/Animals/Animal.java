package Lesson6.Animals;

public abstract class Animal {
    String name;
    String color;
    int age;
    int swimdistance;
    int rundistance;

    public Animal(String name, String color, int age, int rundistance, int swimdistance) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.rundistance = rundistance;
        this.swimdistance = swimdistance;

    }
    public void info() {
        System.out.printf("%s %s %d %d %d\n", name, color, age, rundistance, swimdistance);
    }
    

    public abstract void runCat();

    public abstract void swimCat();

    public abstract void runDog();

    public abstract void swimDog();
}
