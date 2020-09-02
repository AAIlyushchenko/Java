package ru.geekbrains.catch_the_drop;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        //        ---------------------------------------------------------------------------------
        System.out.println("Задание 1. Задать целочисленный массив, состоящий из элементов 0 и 1. \n" +
                "Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0\n");
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 0) {
                arr1[i] = 1;
            } else {
                arr1[i] = 0;
            }
        }
        System.out.println("Массив arr1 " + Arrays.toString(arr1) + "\n");

        //        ---------------------------------------------------------------------------------
        System.out.println("Задание 2. Задать пустой целочисленный массив размером 8. \n" +
                "С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21\n");
        int[] arr2 = new int[8];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i * 3;
        }
        System.out.println("Массив arr2 " + Arrays.toString(arr2) + "\n");

        //        ---------------------------------------------------------------------------------
        System.out.println("Задание 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] \n" +
                "пройти по нему циклом, и числа меньшие 6 умножить на 2\n");
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] = arr3[i] * 2;
            }
        }
        System.out.println("Массив arr3 " + Arrays.toString(arr3) + "\n");

        //        ---------------------------------------------------------------------------------

        System.out.println("Задание 4. Создать квадратный двумерный целочисленный массив (количество строк \n" +
                    "и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами");

        int counter = 1;
        int[][] table = new int[7][7];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                table[i][j] = counter;
                if (i == j || i + j == table.length - 1) {
                    table[i][j] = 1;
                }
                System.out.print(table[i][j] + " ");
                counter++;
            }
            System.out.println();
        }

        }
    }


