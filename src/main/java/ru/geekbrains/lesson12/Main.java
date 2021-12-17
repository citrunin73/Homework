package ru.geekbrains.lesson12;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Выполнение первого метода");
        final int SIZE = 10000000;
        final int HALF = SIZE / 2;
        float[] arr = new float[SIZE];
        Arrays.fill(arr, 1);
        long a = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.currentTimeMillis();
        System.out.println("Время выполнения программы первого метода: " + ((System.currentTimeMillis()-a))+"мс");
        System.out.println("Завершнение выполнения первого метода");
        mainV2();
    }

    public static void mainV2() {
        System.out.println("Выполнение второго метода:");
        System.out.println("Выполнение главного потока ...");
        final int SIZE = 10000000;
        final int HALF = SIZE / 2;
        float[] arr = new float[SIZE];
        Arrays.fill(arr, 1);
        long a = System.currentTimeMillis();
        float[] arr1 = new float[HALF];
        float[] arr2 = new float[HALF];
        System.arraycopy(arr, 0, arr1, 0, HALF);
        System.arraycopy(arr, HALF, arr2, 0, HALF);

        MyThread myThread = new MyThread(arr1);
        MyThread1 myThread1 = new MyThread1(arr2);

        myThread.start();
        myThread1.start();

        System.arraycopy(arr1, 0, arr, 0, HALF);
        System.arraycopy(arr2, 0, arr, HALF, HALF);
        System.currentTimeMillis();
        System.out.println("Время выполнения программы второго метода: " + ((System.currentTimeMillis()-a))+"мс");
        System.out.println("Завершение выполнения главного потока ...");

    }

    static class MyThread extends Thread{
        private float[]arr1;

        public MyThread(float[] arr1) {
            this.arr1 = arr1;
        }


        @Override
        public void run() {
            System.out.println("Поток 1");
            for (int i = 0; i < arr1.length; i++) {
                arr1[i] = (float)(arr1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        }
    }
    static class MyThread1 extends Thread{
        private float[]arr2;

        public MyThread1(float[] arr2) {
            this.arr2 = arr2;
        }


        @Override
        public void run() {
            System.out.println("Поток 2");
            for (int i = 0; i < arr2.length; i++) {
                arr2[i] = (float)(arr2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        }
    }
}