package Lesson10;


public class MyArrayCheck {

    public static void printArr(Object arr[][]) throws MyArraySizeException {

        for (int i = 0; i < arr.length; i++) {
            if (arr.length > 4) {
                throw new MyArraySizeException("Не верный размер массива!");
            }
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i].length > 4) {
                    throw new MyArraySizeException("Не верный размер массива!");
                }
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int parseintArr(Object[][] arr) throws MyArrayDataException {
        try {
            int summ = 0;
//           для проверки исключения;
//            arr[2][2] = Integer.parseInt("c");
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = Integer.parseInt("1");
                    summ += (int) arr[i][j];
                    System.out.print(arr[i][j] + "\t");
                }
                System.out.println();
            }
            System.out.println("Сумма всех элементов массива= " + summ);
            return summ;
        } catch (NumberFormatException e) {
            e.printStackTrace();
            e.getCause();
            throw new MyArrayDataException("Не верный формат данных в ячейке ");
        }

    }

}
