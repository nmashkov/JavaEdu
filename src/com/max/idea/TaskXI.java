package com.max.idea;

import java.util.Scanner;

public class TaskXI {
    public static void main(String[] args) {
        //    1. Ввести первое число с клавиатуры и записать его в строковую переменную.
        //    2. Ввести второе число с клавиатуры и сохранить его в целочисленную переменную типа int.
        //    3. Сравнить 2 числа и вывести большее на экран.
        //    4. Выведите также меньшее число на экран, предварительно переконвертировать его в тип double.
        //
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        String number1 = in.next();
        System.out.print("Введите второе число: ");
        int number2 = in.nextInt();
        in.close();
        //
        int number1Int = Integer.parseInt(number1);
        int max = Math.max(number1Int, number2);
        System.out.printf("Наибольшее число: %d%n", max);
        //
        double min = Math.min(number1Int, number2);
        System.out.printf("Наименьшее число: %.2f%n", min);
    }
}
