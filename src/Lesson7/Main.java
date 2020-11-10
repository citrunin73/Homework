package Lesson7;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Barsik", 40),
                new Cat("Murzik", 50),
                new Cat("Chesir", 40),
                new Cat("Murka", 50),
                new Cat("Lizun", 15)

        };

        Plate plate = new Plate(100);
        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(plate);
        }
    }

}

