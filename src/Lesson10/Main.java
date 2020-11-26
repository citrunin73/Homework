package Lesson10;


public class Main {
    public static void main(String[] args) {
        Object arr[][] = new Object[4][4];
        try {
            MyArrayCheck.printArr(arr);
            MyArrayCheck.parseintArr(arr);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }
}