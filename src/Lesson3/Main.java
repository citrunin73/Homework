package Lesson3;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        Game();
        Ask();
    }

    public static void Game() {
        int TryCount = 3;
        int a = (int) (Math.random() * 10);
        for (int i = 1; i <= TryCount; i++) {
            System.out.println("Введите число:");
            int x = sc.nextInt();
            if (x == a) {
                System.out.println("You win!");
                break;
            } else if (i == TryCount) {
                System.out.println("You lose.");
                break;
            } else if (x > a) {
                System.out.println("Вы ввели слишком больше число");
            } else if (x < a) {
                System.out.println("Вы ввели слишком маленькое число");
            }

        }
    }

    public static void Ask() {
        do {
            System.out.println("Повторить игру еще раз?\n 1 – да / 0 – нет");
            int a = sc.nextInt();
            if (a == 1) {
                Game();
            } else
                break;
        }while (true) ;
    }
}







