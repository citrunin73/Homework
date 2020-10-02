package Lesson1;

public class Main {
    public static void main(String[] args) {
//    1)
        byte a = Byte.MAX_VALUE;
        short b = Short.MAX_VALUE;
        int c = Integer.MAX_VALUE;
        long d = Long.MAX_VALUE;
        float e = Float.MAX_VALUE;
        double f = Double.MAX_VALUE;
        char j = Character.MAX_VALUE;
        boolean h = false;
//    2)
        double i = Result(a, b, c, d);
//    3)
        boolean k = Result1(a, b);
//    4)
        int s = 5;
        printResult(s);
//    5)
        boolean y = Result3(a);
        String n = "Иван";
        printName(n);
//    6)
        int year = 2020;
        printHear(year);



    }

    static double Result(double a, double b, double c, double d) {
        return a * (b + (c / d));
    }

    static boolean Result1(double a, double b){
        if ((a+b)>=10 && (a+b)<=20){
            return true;
        } else {
            return false;
        }
    }

    static void printResult(int s){
        if (s >= 0) {
            System.out.println("Это положительное число");
        } else {
            System.out.println("Это отрицательное число");
        }
    }

    static boolean Result3(double a){
        if (a < 0){
            return true;
        } else {
            return false;
        }
    }

    static void printName(String n){
        System.out.println("Привет, " + n + "!");
    }

    static void printHear(int year){
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100!=0)){
            System.out.println("Этот год високосный");
        } else {
            System.out.println("Этот год не високосный");
        }
    }
}
