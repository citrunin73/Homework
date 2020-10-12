package Lesson5;

public class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int payment;
    private int age;

    public Employee(String name, String position, String email, String phone, int payment, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.payment = payment;
        this.age = age;
    }
    public void info() {
        System.out.println("ФИО: " + name + "; Должность: " + position + "; Email: " + email + "; Номер телефона: " + phone + "; Зарплата: " + payment + "; Возраст: " + age);
    }
    public void age(){
        if (age>40){
            System.out.println("ФИО: " + name + "; Должность: " + position + "; Email: " + email + "; Номер телефона: " + phone + "; Зарплата: " + payment + "; Возраст: " + age);
        }
    }
}
