package Lesson2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arr [] = {1,1,0,0,1,0,1,1,0,0};
        printArr(arr);
        int arr1 [] = new int[8];
        printArr1(arr1);
        int arr2 [] [] = new int [5] [5];
        printArr2(arr2);
        int arr3 [] = {10,55,-15,13,16};
        int max=0;
        printArr3max(arr3,max);
        int min=arr3[0];
        printArr3min(arr3,min);
        boolean c = printCheckBalance(arr3);
        System.out.println();
    }

    public static void printArr(int arr []){
        for (int i = 0; i < arr.length; i++) {
            if( arr[i]==1){
                arr[i]=0;
            } else {
                arr[i]=1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void printArr1(int arr1 []){
        for (int i = 1; i < arr1.length; i++) {
            arr1[i]  = (arr1[i-1]+3);
        }
        System.out.println(Arrays.toString(arr1));
    }

    public static void printArr2(int arr2 [] []){
        for (int i = 0;i < arr2.length ; i++) {
            for (int j = 0;j < arr2[i].length ; j++){
                if (i==j){
                    arr2[i][j]=1;
                } else if (i+j== arr2.length-1){
                    arr2[i][j]=1;
                }
                System.out.print(arr2[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public static void printArr3max(int arr3 [], int max) {
        for (int i = 0;i < arr3.length; i++){
            if (max < arr3[i]){
                max = arr3[i];
            }
        } System.out.println("ArrayMax= " + max);

    }

    public static void printArr3min(int arr3 [], int min) {
        for (int i = 0;i < arr3.length; i++){
            if (min > arr3[i]){
                min = arr3[i];
            }
        } System.out.println("ArrayMin= " + min);

    }

    public static boolean printCheckBalance(int[] arr3) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < arr3.length ; i++) {
            a = a + arr3[i];
            b = b + arr3[arr3.length-(i+1)];
            if (a == b) {
                System.out.println(true);
                return true;
            }
        }
        System.out.println(false);
        return false;
    }
}
