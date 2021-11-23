package ru.geekbrains.lesson6.Animals;

public class Dog extends Animal {

    public Dog(String name, String color, int age, int rundistance, int swimdistance) {
        super(name, color, age, rundistance, swimdistance);
    }
    public void runDog() {
        if (this.rundistance <= 500) {
            System.out.printf("%s пробежал %dм!\n", name,rundistance);
        } else {
            System.out.printf("%s не может так далеко бегать!\n",name);
        }
    }

    public void swimDog() {
        if (this.swimdistance <= 10) {
            System.out.printf("%s проплыл %dм!\n", name,rundistance);
        } else {
            System.out.printf("%s не может так далеко плавать!\n",name);
        }
    }

    @Override
    public void runCat() {

    }

    @Override
    public void swimCat() {

    }
}