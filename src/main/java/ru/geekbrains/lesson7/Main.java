package ru.geekbrains.lesson7;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Барсик", 40),
                new Cat("Мурзик", 50),
                new Cat("Чешир", 40),
                new Cat("Майк", 50),
                new Cat("Базилио", 15)

        };

        Plate plate = new Plate(100);
        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(plate);
        }
    }
}

class Cat {
    private final String name;
    private final int satiety;

    public Cat(String name, int satiety) {
        this.name = name;
        this.satiety = satiety;
    }

    public void eat(Plate plate) {
        if (satiety > plate.getFood()) {
            System.out.println("Недостаточно еды для " + name + "!");
            System.out.println("Добавить еды!");
            plate.increaseFood(satiety);
            eat(plate);
        } else {
            System.out.println("Кот " + name + " ест...");
            System.out.println("Кот " + name + " сытый!");
            plate.decreaseFood(satiety);
        }
    }
}

class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public int getFood() {
        return food;
    }
    public void decreaseFood(int amount) {
        if (amount < 0) {
            return;
        }
        food -= amount;
    }
    public void increaseFood(int amount) {
        if (food < amount) {
            food = 100;
            System.out.println("Миска снова полная!");
        }

    }
    public String toString() {
        return "Осталось в миске: " + food;
    }
}
