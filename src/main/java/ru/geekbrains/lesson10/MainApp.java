package ru.geekbrains.lesson10;

import java.util.ArrayList;
import java.util.Objects;

public class MainApp {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<>();
        a1.add("cоздать");
        a1.add("массив");
        a1.add("список");
        a1.add("набором");
        a1.add("слов");
        a1.add("слов");
        a1.add("массив");
        a1.add("встречаться");
        a1.add("повторяющиеся");
        a1.add("найти");
        a1.add("вывести");
        System.out.println(a1);
        for (int i = 0; i < a1.size(); i++) {
            int count = 1;
            for (int k = i + 1; k < a1.size(); k++) {
                if (a1.get(i) == a1.get(k)) {
                    count++;
                }
            }
            System.out.println("Слово " + "'" + a1.get(i) + "'" + " встречается " + count + " раз(a).");

        }
        for (int i = 0; i < a1.size(); i++) {
            for (int k = i + 1; k < a1.size(); k++) {
                if (!Objects.equals(a1.get(i), a1.get(k))) {
                    continue;
                } else {
                    a1.remove(a1.get(i));
                }
            }
        }
        System.out.println(a1);
        System.out.println();

    }
}
