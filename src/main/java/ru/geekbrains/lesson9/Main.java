package ru.geekbrains.lesson9;

public class Main {
    public static void main(String[] args) {
        Object arr[][] = new Object[4][4];
        try {
            MyArrayCheck.printArr(arr);
            //Для проверки работы исключения.
            //         arr[2][2] = "c";
            MyArrayCheck.parseintArr(arr);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }
}

class MyArrayCheck {

    public static void printArr(Object[][] arr) throws MyArraySizeException {

        for (Object[] objects : arr) {
            if (arr.length != 4) {
                throw new MyArraySizeException("Не верный размер массива!");
            }
            for (Object object : objects) {
                if (objects.length != 4) {
                    throw new MyArraySizeException("Не верный размер массива!");
                }
                System.out.print(object + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void parseintArr(Object[][] arr) throws MyArrayDataException {
        int summ = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == null) {
                    arr[i][j] = Integer.parseInt("1");
                    summ += (int) arr[i][j];
                    System.out.print(arr[i][j] + "\t");
                } else {
                    System.out.println();
                    throw new MyArrayDataException("Не верный формат данных в ячейке [" + (i + 1) + "]" + "[" + (j + 1) + "] !!!");
                }
            }
            System.out.println();
        }
        System.out.println("Сумма всех элементов массива= " + summ);


    }

}

class MyArrayDataException extends Exception {
    public MyArrayDataException(String message) {
        super(message);
    }
}

class MyArraySizeException extends Exception {
    public MyArraySizeException(String message) {
        super(message);
    }
}