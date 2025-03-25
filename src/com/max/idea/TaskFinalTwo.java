package com.max.idea;

import java.util.Scanner;

public class TaskFinalTwo {
    public static void main(String[] args) {
        //    Напишите программу, которая позволит решить простое уравнение относительно x.
        //    Программа принимает на вход строку длиной 5 символов.
        //    Второй символ строки является знаком ‘+’ или ‘-’, четвертый символ строки ‘=’.
        //    Первым, третьим и пятым символом являются две цифры (от 0 до 9)
        //    и буква ‘x’ (обозначает неизвестное) в любом порядке.
        //    Нужно найти неизвестное.
        //    Пример для теста работы программы:
        //    - Ввод: x+5=7
        //    - Вывод: 2
        //    - Ввод: 3-x=9
        //    - Вывод: -6
        //    - Ввод: 3-3=x
        //    - Вывод: 0
        //
        Scanner in = new Scanner(System.in);
        System.out.print("Введите уравнение из 5 символов: ");
        String str = in.nextLine();
        String[] strArray = new String[5];
        in.close();
        //
        for (int i = 0; i < str.length(); i++) {
            String ch = String.valueOf(str.charAt(i));
            strArray[i] = ch;
        }
        // x+1=2
        if (strArray[0].equals("x")) {
            int firNum;
            int secNum = Integer.parseInt(strArray[2]);
            int resNum = Integer.parseInt(strArray[4]);
            if (strArray[1].equals("+")) {
                firNum = resNum - secNum;
            } else {
                firNum = resNum + secNum;
            }
            System.out.printf("Вывод: %d%n", firNum);
        // 1+x=2
        } else if (strArray[2].equals("x")) {
            int firNum = Integer.parseInt(strArray[0]);
            int secNum;
            int resNum = Integer.parseInt(strArray[4]);
            if (strArray[1].equals("+")) {
                secNum = resNum - firNum;
            } else {
                secNum = firNum - resNum;
            }
            System.out.printf("Вывод: %d%n", secNum);
        // 1+3=x
        } else if (strArray[4].equals("x")) {
            int firNum = Integer.parseInt(strArray[0]);
            int secNum = Integer.parseInt(strArray[2]);
            int resNum;
            if (strArray[1].equals("+")) {
                resNum = firNum + secNum;
            } else {
                resNum = firNum - secNum;
            }
            System.out.printf("Вывод: %d%n", resNum);
        } else {
            System.out.println("Ошибка!");
        }
    }
}
