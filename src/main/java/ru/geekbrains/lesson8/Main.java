package ru.geekbrains.lesson8;

public class Main {
    public static void main(String[] args) {
        Distance[] distances = {
                new Human("Иван"),
                new Cat("Барсик"),
                new Human("Джек"),
                new Robot("Жестянка")
        };
        Obstacles[] obstacles = {
                new Wall(),
                new RunningTrack()

        };
        for (Distance c : distances) {
            for (Obstacles a : obstacles) {
                a.doIt(c);
            }
        }
    }

}

class Human implements Distance {
    private String name;


    public Human(String name) {
        this.name = name;

    }

    @Override
    public void jump() {
        System.out.println("Человек " + name + " перепрыгнул стену");
    }

    @Override
    public void run() {
        System.out.println("Человек " + name + " пробежал дистанцию");
    }
}

class Robot implements Distance {
    private String name;


    public Robot(String name) {
        this.name = name;

    }

    @Override
    public void jump() {
        System.out.println("Робот " + name + " перепрыгнул стену");
    }

    @Override
    public void run() {
        System.out.println("Робот " + name + " пробежал дистанцию");
    }
}

class Cat implements Distance {
    private String name;


    public Cat(String name) {
        this.name = name;

    }

    @Override
    public void jump() {
        System.out.println("Кот " + name + " перепрыгнул стену");
    }

    @Override
    public void run() {
        System.out.println("Кот " + name + " пробежал дистанцию");
    }
}

interface Distance {
    void run();
    void jump();
}

interface Obstacles {
    void doIt(Distance c);
}

class RunningTrack implements Obstacles {
    @Override
    public void doIt(Distance c) {
        c.run();
    }
}

class Wall implements Obstacles {
    @Override
    public void doIt(Distance c) {
        c.jump();
    }

}
