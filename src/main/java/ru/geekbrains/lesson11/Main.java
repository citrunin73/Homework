package ru.geekbrains.lesson11;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Задание 1
        Integer[] intArr = new Integer[2];

        intArr[0] = 1;
        intArr[1] = 2;

        System.out.println(Arrays.deepToString(intArr));
        swap(intArr, 0, 1);
        System.out.println(Arrays.deepToString(intArr));

        // Задание 2
        ArrayList<Integer> arrList = toArrayList(intArr);

        // Задание 3
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();

        Box<Apple> box1 = new Box<Apple>(apple1, apple2, apple3);
        Box<Orange> box2 = new Box<Orange>(orange1, orange2);

        System.out.println(box1.compare(box2));

        Box<Orange> box3 = new Box<Orange>();
        box2.transfer(box3);
    }


    public static void swap(Object[] arr, int index1, int index2) {
        Object tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }


    public static <T> ArrayList<T> toArrayList(T[] arr) {
        return new ArrayList<T>(Arrays.asList(arr));
    }
    public abstract static class Fruit {
        protected float weight;

        public Fruit(float weight) {
            this.weight = weight;
        }

        public float getWeight() {
            return weight;
        }
    }
    public static class Box<T extends Fruit> {
        private ArrayList<T> items;

        public Box(T... items) {
            this.items = new ArrayList<T>(Arrays.asList(items));
        }

        public void add(T... items) {
            this.items.addAll(Arrays.asList(items));
        }

        public void remove(T... items) {
            for (T item: items) this.items.remove(item);
        }

        public ArrayList<T> getItems() {
            return new ArrayList<T>(items);
        }

        public void clear() {
            items.clear();
        }

        public float getWeight() {
            if (items.size() == 0) return 0;
            float weight = 0;
            for (T item: items) weight += item.getWeight();
            return weight;
        }

        public boolean compare(Box box) {
            return this.getWeight() == box.getWeight();
        }

        public void transfer(Box<? super T> box) {
            box.items.addAll(this.items);
            clear();
        }
    }
    public static class Apple extends Fruit {
        public Apple() {
            super(1f);
        }
    }
    public static class Orange extends Fruit {
        public Orange() {
            super(1.5f);
        }
    }
}