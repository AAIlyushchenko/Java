package ru.geekbrains.catch_the_drop;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


//        1. Написать программу, которая загадывает случайное число от 0 до 9,
//        и пользователю дается 3 попытки угадать это число. При каждой попытке
//        компьютер должен сообщить больше ли указанное пользователем число чем
//        загаданное, или меньше. После победы или проигрыша выводится запрос –
//        «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).

        Random rand = new Random();
        int answer = rand.nextInt(9);
        int app = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Угадайте число от 0 до 9. У вас 3 попытки");
          do {comparing(answer);
              System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
              app = sc.nextInt();
          } while (app == 1);
    }

    public static void comparing(int answer){
        for (int i = 1; i < 4; i++) {
            System.out.println("Попытка " + i + ":");
            Scanner sc = new Scanner(System.in);
            int userAnswer = sc.nextInt();
            if (userAnswer == answer) {
                System.out.println("Поздравляю! Вы угадали");
                break;
            } else if (userAnswer > answer) {
                System.out.println("Ваш ответ больше загаданного числа");
            } else {
                System.out.println("Ваш ответ меньше загаданного числа");
            }
        }
    }
}



