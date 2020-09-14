package ru.geekbrains.catch_the_drop;


//1.	Создать классы Собака и Кот с наследованием от класса Животное.
//2.	Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия. Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
//3.	У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).

public class Animal {
    String type = "Животное";
    String name = "Без_клички";

    public Animal() {
    }

    public void run(int distance){
        System.out.println(type + " " + name +" пробежало " + distance);
    }

    public void sail (int distance){
        System.out.println(type + " " + name +" проплыло " + distance);
    }
}
