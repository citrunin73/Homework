package ru.geekbrains.lesson6;

import ru.geekbrains.lesson6.Animals.*;

public class Main {
    public static void main(String[] args) {

        Animal[] animals = {
                new Cat("Барсик", "Рыжий", 2, 130, 5),
                new Dog("Тузик", "Белый", 3, 560, 8),
                new Dog("Бобик", "Серый", 6, 300, 15)
        };
        for (Animal animal : animals) {
            animal.runCat();
            animal.swimCat();
            animal.runDog();
            animal.swimDog();
        }

        System.out.printf("Всего животных: %d\n", animals.length);
    }

}

