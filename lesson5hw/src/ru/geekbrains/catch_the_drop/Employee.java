package ru.geekbrains.catch_the_drop;


// ----------Задание 1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст ----------
public class Employee {
    String fullName;
    String position;
    String email;
    String phone;
    int salary;
    int age;

    //--------Задание 2. Конструктор класса должен заполнять эти поля при создании объекта -----------------------------
    public Employee (String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    //-------Задание 3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль-------
    public void info(){
        System.out.println("ФИО: " + fullName + "; Должность: " + position + "; Email: "
                + email + "; Телефон: " + phone + "; Зарплата: " + salary + "; Возраст: " + age);
    }
    //-------Задание 5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет---------------------------

    public void over40(){
        if (age > 40){
            info();
        }
    }

}
