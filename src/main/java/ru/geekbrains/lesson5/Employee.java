package ru.geekbrains.lesson5;

public class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int payment;
    protected int age;

    public Employee(String name, String position, String email, String phone, int payment, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.payment = payment;
        this.age = age;
    }
    void info() {
        System.out.printf("ФИО: %s\nДолжность: %s\nEmail: %s\nНомер телефона: %s\nЗарплата: %d\nВозраст: %d\n\n", name, position, email, phone, payment, age);
    }
}
