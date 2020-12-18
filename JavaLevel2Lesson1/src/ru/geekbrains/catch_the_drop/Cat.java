package ru.geekbrains.catch_the_drop;

public class Cat implements Moveable {

    @Override
    public void run() {
        System.out.println("Кот побежал");
    }

    @Override
    public void jump() {
        System.out.println("Кот прыгнул");
    }
}
