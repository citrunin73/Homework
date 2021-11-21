package ru.geekbrains.lesson4;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static final int SIZE = 5;
    static final int DOTS_TO_WIN = 4;
    static final char DOT_X = 'X';
    static final char DOT_O = 'O';
    static final char DOT_EMPTY = '.';
    static char[][] map;
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {

        while (true) {
            initMap();
            printMap();
            while (true) {
                humanTurn();
                printMap();
                if (checkWin(DOT_X)) {
                    System.out.println("Вы победитель!");
                    break;
                }
                if (isFull()) {
                    System.out.println("Ничья!");
                    break;
                }
                aiTurn();
                printMap();
                if (checkWin(DOT_O)) {
                    System.out.println("Комьютер победил!");
                    break;
                }
                if (isFull()) {
                    System.out.println("Ничья!");
                    break;
                }
            }
            System.out.print("Желаете сыграть еще раз? (Y - да): ");
            if (!sc.next().equalsIgnoreCase("Y"))
                break;
        }
    }
    /**
     * Инициализация объектов игры
     */
    static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }
    /**
     * Отрисовка игрового поля
     */
    static void printMap() {
        System.out.print("  ");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
    /**
     * Обработка хода игрока (человека)
     */
    static void humanTurn() {
        int x;
        int y;
        do {
            System.out.print("Введите координаты хода X и Y (от 1 до " + SIZE + ") через пробел >>> ");
            x = sc.nextInt()-1 ;
            y = sc.nextInt()-1 ;
        } while (!isCellValid(y, x));

        map[y][x] = DOT_X;
    }
    /**
     * Обработка хода компьютера
     */
    static void aiTurn() {
        int x;
        int y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(y, x));

        map[y][x] = DOT_O;
    }
    /**
     * Проверка корректности ввода (координаты хода не должны превышать размерность массива,
     * описывающего игровое поле)
     */
    static boolean isCellValid(int y, int x) {
        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE) {
            System.out.println("Вы ввели некорретные координаты, пожалуйста, попробуйте еще раз!");
            return false;
        }
        return map[y][x] == DOT_EMPTY;
    }
    /**
     * Проверка, ячейка является пустой (DOT_EMPTY)
     */
    static boolean isFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }
    /**
     * Проверка победы
     * @param c Фишка игрока (человек или компьютер)
     * @return Результат проверки победы
     */
    static boolean checkWin(char c) {
        for (int i = 0; i < SIZE; i++) {
            int z = 0;
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == c) {
                    z++;
                    if (z == DOTS_TO_WIN) {
                        return true;
                    }
                }
                if (map[i][j] != c) {
                    z = 0;
                }
            }
        }
        for (int j = 0; j < SIZE; j++) {
            int z = 0;
            for (int i = 0; i < SIZE; i++) {
                if (map[i][j] == c) {
                    z++;
                    if (z == DOTS_TO_WIN) {
                        return true;
                    }
                }
                if (map[i][j] != c) {
                    z = 0;
                }
            }
        }
        int z = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == c && i == j) {
                    z++;
                    if (z == DOTS_TO_WIN) {
                        return true;
                    }
                } else if (map[i][j] != c && i == j) {
                    z = 0;
                }
            }


        }
        z = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == c && i + j == SIZE - 1) {
                    z++;
                    if (z == DOTS_TO_WIN) {
                        return true;
                    }
                } else if (map[i][j] != c && i + j == SIZE - 1) {
                    z = 0;
                }
            }


        }
        return false;
    }
}
