package ru.geekbrains.lesson6.Animals;

public class Cat extends Animal {
    public Cat(String name, String color, int age, int rundistance, int swimdistance) {
        super(name, color, age, rundistance, swimdistance);

    }
    public void runCat() {
        if (this.rundistance <= 200) {
            System.out.printf("%s пробежал %dм!\n", name,rundistance);
        } else {
            System.out.printf("%s не может так далеко бегать!\n",name);
        }
    }

    public void swimCat() {
        System.out.printf("Кот %s не любит воду, нечего его в нее совать!\n", name);
    }

    @Override
    public void runDog() {

    }

    @Override
    public void swimDog() {

    }

}