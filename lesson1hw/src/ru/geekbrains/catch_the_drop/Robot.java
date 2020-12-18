package ru.geekbrains.catch_the_drop;

public class Robot implements Moveable{

    @Override
    public void run() {
        System.out.println("Робот побежал");
    }

    @Override
    public void jump() {
        System.out.println("Робот прыгнул");
    }
}
