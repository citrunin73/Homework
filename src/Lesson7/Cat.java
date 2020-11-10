package Lesson7;

public class Cat {
    private String name;
    private int satiety;

    public Cat(String name, int satiety) {
        this.name = name;
        this.satiety = satiety;
    }

    public void eat(Plate plate) {
        if (satiety > plate.getFood()) {
            System.out.println("Not enough food for " + name + "!");
            System.out.println("Increasing food!");
            plate.increaseFood(satiety);
            eat(plate);
        } else {
            System.out.println("Cat " + name + " eat...");
            System.out.println("Cat " + name + " satiety!");
            plate.decreaseFood(satiety);
        }
    }
}
