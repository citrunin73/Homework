package ru.geekbrains.lesson1;

public class MainApp {
    //region Задача_1
    public static void main(String[] args) {

        //region Задача_2
        byte aMax = 127;
        short bMax = 32767;
        int cMax = 2147483647;
        long dMax = 9223372036854775807L;
        float eVal = 3.14F;
        double fVal = 3.141592;
        char gVal = '\u0000';
        boolean hVal = true;
        //endregion
        System.out.printf( "Результат вычисления: %.4f\n",result(3.14F,3.14F,3.14F,3.14F));
        System.out.println(moreLess(5,5));
        System.out.println(aboveZero(7));
        System.out.println(trueFalse(0));
        print("Станислав");
        System.out.println(leapYear(2020));

    }
    //endregion
    //region Задача_3
    public static float result(float a,float b,float c,float d) {
        return a * (b + (c / d));
    }

    //endregion
    //region Задача_4
    public static boolean moreLess(int a, int b) {
        return (a + b) >= 10 && (a + b) <= 20;

    }
    //endregion
    //region Задача_5
    public static String aboveZero(int c) {
        if (c >= 0) {
            return "Число " + c + " положительное!";
        } else {
            return "Число " + c + " отрицательное!";
        }

    }
    //endregion
    //region Задача_6
    public static boolean trueFalse(int d) {
        return d < 0;
    }
    //endregion
    //region Задача_7
    public static void print(String e) {
        System.out.println("Привет, " + e + "!");

    }
    //endregion

    //region Задача_8
    public static String leapYear(int year) {
        if (year % 4 == 0 && (year % 400 == 0 || year % 100 !=0)) {
            return "Год високосный!";
        }
        else return "Год не високосный!";
    }
    //endregion
}
