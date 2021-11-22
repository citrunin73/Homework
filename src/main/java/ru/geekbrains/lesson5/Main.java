package ru.geekbrains.lesson5;

public class Main {
    public static void main(String[] args) {
        Employee[] employeesArray = new Employee[5];

        employeesArray[0] = new Employee("Иванов Иван Иванович", "Директор", "ivanov@mail.ru", "79995555555", 100000, 43);
        employeesArray[1] = new Employee("Петров Петр Петрович", "Программист", "ivanov@mail.ru", "79995555555", 50000, 35);
        employeesArray[2] = new Employee("Иванов Петр Иванович", "Программист", "ivanov@mail.ru", "79995555555", 50000, 29);
        employeesArray[3] = new Employee("Иванов Геннадий Иванович", "Стажер", "ivanov@mail.ru", "79995555555", 15000, 18);
        employeesArray[4] = new Employee("Чванов Михаил Иванович", "Бухгалтер", "ivanov@mail.ru", "79995555555", 30000, 50);

        for (int i = 0; i < employeesArray.length; i++) {
            if (employeesArray[i].age > 40) {
                employeesArray[i].info();
            }
        }
    }
}

