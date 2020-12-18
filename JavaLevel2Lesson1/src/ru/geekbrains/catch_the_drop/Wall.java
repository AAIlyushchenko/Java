package ru.geekbrains.catch_the_drop;

public class Wall implements Result {
    @Override
    public void success() {
        System.out.println("Перепрыгнул стену");
    }

    @Override
    public void fail() {
        System.out.println("Не смог перепрыгнуть стену");
    }
}
