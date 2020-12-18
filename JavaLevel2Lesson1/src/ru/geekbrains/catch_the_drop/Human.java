package ru.geekbrains.catch_the_drop;

public class Human implements Moveable{

    @Override
    public void run() {
        System.out.println("Человек побежал");
    }

    @Override
    public void jump() {
        System.out.println("Человек прыгнул");
    }
}
