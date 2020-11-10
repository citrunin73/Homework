package Lesson6;

import Lesson6.Animals.*;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", "red", 2, 150, 10);
        Dog dog = new Dog("Tuzik", "white", 3, 30, 5);

        Animal[] animals = {
                new Cat("Barsik", "red", 2, 130, 5),
                new Dog("Tuzik", "white", 3, 560, 8),
                new Dog("Vulkan", "white", 6, 300, 15)
        };

        for (int i = 0; i < animals.length; i++) {
            animals[i].runCat();
            animals[i].swimCat();
            animals[i].runDog();
            animals[i].swimDog();

        }

    }
}
