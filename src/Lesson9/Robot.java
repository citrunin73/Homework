package Lesson9;

public class Robot implements Distance{
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


