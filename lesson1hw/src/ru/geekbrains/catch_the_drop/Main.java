package ru.geekbrains.catch_the_drop;

public class Main {

    public static void main(String[] args) {
        

        Moveable[] moveables = {
                new Cat(),
                new Human(),
                new Robot(),
        };

        System.out.println("\nЗадание 1: Создайте три класса Человек, Кот, Робот, которые не наследуются от одного \n" +
                "класса. Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о \n" +
                "действии в консоль).\n");

        for (Moveable i : moveables) {
            i.jump();
            i.run();
        }

        System.out.println("\nЗадание 2: Создайте два класса: беговая дорожка и стена, при прохождении через которые,\n" +
                "участники должны выполнять соответствующие действия (бежать или прыгать), результат \n" +
                "выполнения печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).\n");

        Result[] results = {
                new Treadmill(),
                new Wall(),
        };

        for (Result i : results) {
            i.fail();
            i.success();
        }

        System.out.println("\nЗадание 3: Создайте два массива: с участниками и препятствиями, \n" +
                "и заставьте всех участников пройти этот набор препятствий.\n");

        System.out.println("Не разобрался как сделать это задание");



    }
}
