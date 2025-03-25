package com.max.idea;

import java.util.Scanner;

public class TaskXIII {
    public static void main(String[] args) {
        //    Напишите программу, где пользователь должен ввести строку из слов,
        //    разделенных пробелами. Например: “I love java 8 Я люблю java 14 core1”.
        //    Выполните следующие действия:
        //    1. Выведите слова, состоящие только из латиницы.
        //    2. Выведите количество этих слов.
        //
        Scanner in = new Scanner(System.in);
        System.out.println("Введите предложение из слов, разделенных пробелами: ");
        String str = in.nextLine();
        in.close();
        //
        int count = 0;
        String latinAlphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String[] strArray = str.split(" ");
        for (String el : strArray) {
            boolean check = true;
            for (int i = 0; i < el.length(); i++) {
                String ch = String.valueOf(el.charAt(i));
                if (!latinAlphabet.contains(ch)) {
                    check = false;
                    break;
                }
            }
            if (check) {
                count += 1;
                System.out.printf("latin: %s%n",el);
            }
        }
        System.out.printf("Количество слов: %d%n", count);
    }
}
