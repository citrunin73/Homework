package Lesson9;

public class Human implements Distance{
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

