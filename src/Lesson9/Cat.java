package Lesson9;

    public class Cat implements Distance{
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
