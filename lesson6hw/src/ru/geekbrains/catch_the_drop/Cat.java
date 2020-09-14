package ru.geekbrains.catch_the_drop;


//1.	Создать классы Собака и Кот с наследованием от класса Животное.
//2.	Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия. Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
//3.	У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).



public class Cat extends Animal{

    public Cat(String type, String name) {
        this.type = type;
        this.name = name;
    }

    @Override
    public void run(int distance){
        if (distance <= 200){
            System.out.println(type + " " + name +" пробежал(а) " + distance);
        } else {
            System.out.println(type + " " + name +" пробежала 200 метров и прилег(ла) отдохнуть ");
        }
    }

    @Override
    public void sail (int distance){
        System.out.println(type + " " + name +" не умеет плавать ");
    }

}

