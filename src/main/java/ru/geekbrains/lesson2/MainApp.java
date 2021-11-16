package ru.geekbrains.lesson2;

public class MainApp {
    public static void main(String[] args) {
        //region Задача1
        int[] arr01 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr01.length; i++) {
            if (arr01[i] == 1) {
                arr01[i] = 0;
            } else {
                arr01[i] = 1;
            }
            System.out.printf("%d ", arr01[i]);

        }
        System.out.println();
        //endregion
        //region Задача2
        int[] arr02 = new int[8];
            for (int i = 0; i < arr02.length; i++) {
                arr02[i] = i * 3;
                System.out.printf("%d ", arr02[i]);

        }
        System.out.println();
        //endregion
        //region Задача3
        int[] arr03 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr03.length; i++) {
            if (arr03[i] <= 6) {
                arr03[i] = arr03[i] * 2;
                System.out.printf("%d ", arr03[i]);
            } else {
                System.out.printf("%d ", arr03[i]);

            }
        }
        System.out.println();
        //endregion
        //region Задача4
        int[][] arr04 = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}};
        for (int i = 0; i < arr04.length; i++) {
            for (int j = 0; j < arr04.length; j++) {
                if (i == j || i + j == arr04.length - 1) {
                    arr04[i][j] = 1;
                    System.out.printf("%d ", arr04[i][j]);
                } else {
                    System.out.printf("%d ", arr04[i][j]);
                }
            }
            System.out.println();
        }
        //endregion
        //region Задача5
        int[] arr05 = {1, 5, 3, 22, 11, 4, -5, 2, 4, 8, -9, 0};
        int max = arr05[0];
        int min = arr05[0];
        for (int i = 1; i < arr05.length; i++) {
            if (arr05[i] > max) {
                max = arr05[i];
            }
            if (arr05[i] < min) {
                min = arr05[i];
            }

        }
        System.out.printf("Max = %d\n", max);
        System.out.printf("Min = %d\n", min);
        //endregion
        //Для проверки:
        // int[] arr06 = {2, 2, 2, 1, 2, 2, 10, 1};
        //System.out.printf("%b\n", checkBalance(arr06));
        System.out.printf("%b\n", checkBalance(arr05));

    }
        //region Задача6
    public static boolean checkBalance(int[] arr06) {
        int sumLeft = 0;
        int sumRight = 0;
        for (int i = 0; i < arr06.length; i++) {
            sumLeft = sumLeft + arr06[i];
        }
        for (int i = arr06.length - 1; i != 1; i--) {
            if (sumLeft != sumRight) {
                sumLeft = sumLeft - arr06[i];
                sumRight = sumRight + arr06[i];
            } else break;
        }
        return (sumLeft == sumRight);
    }
    //endregion
}

