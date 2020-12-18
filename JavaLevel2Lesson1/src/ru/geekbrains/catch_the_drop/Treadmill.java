package ru.geekbrains.catch_the_drop;

public class Treadmill implements Result{
    @Override
    public void success() {
        System.out.println("Успешно пробежал");
    }

    @Override
    public void fail() {
        System.out.println("Не смог пробежать");
    }
}
