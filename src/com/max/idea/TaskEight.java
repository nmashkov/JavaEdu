package com.max.idea;

import java.util.Scanner;

public class TaskEight {
    public static void main(String[] args) {
        //    Напишите программу, где пользователь вводит любое целое положительное число n.
        //    А программа суммирует все нечетные числа от 1 до введенного пользователем числа n.
        Scanner in = new Scanner(System.in);
        System.out.print("Введите любое целое положительное число: ");
        int number = in.nextInt();
        in.close();
        //
        int sum = 0;
        for (int i=0; i < number; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.printf("Сумма нечётных чисел равна %d%n", sum);
    }
}
