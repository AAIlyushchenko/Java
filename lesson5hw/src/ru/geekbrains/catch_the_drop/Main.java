package ru.geekbrains.catch_the_drop;

public class Main {

    public static void main(String[] args) {

        //-----------------Задание 4. Создать массив из 5 сотрудников---------------------------------------------------
        int age = 0;
        Employee[] emplArray = new Employee[5];
        emplArray[0] = new Employee("Иванов Иван Иванович", "Инженер", "ivivan@mailbox.com", "892312312", 30000, 30);
        emplArray[1] = new Employee("Петров Петр Петрович", "Столяр", "petpet@mailbox.com", "892312455", 30000, 42);
        emplArray[2] = new Employee("Семенов Семен Семенович", "Слесарь", "semsem@mailbox.com", "892312582", 30000, 29);
        emplArray[3] = new Employee("Галкин Кандрат Пантелеевич", "Повар", "galkan@mailbox.com", "892312234", 30000, 35);
        emplArray[4] = new Employee("Сидоров Олег Евгеньевич", "Сантехник", "sidol@mailbox.com", "892312972", 30000, 41);

        //-----------------Задание 5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет-------------
        for (int i = 0; i<5; i++) {
            emplArray[i].over40();
        }

    }
}
