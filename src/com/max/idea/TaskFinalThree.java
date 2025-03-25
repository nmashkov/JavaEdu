package com.max.idea;

import java.util.Scanner;

public class TaskFinalThree {
    public static void main(String[] args) {
        //    Напишите программу, где пользователь вводит сначала количество строк n,
        //    затем сами строки. Среди данных строк найти строку с максимальным
        //    количеством различных символов.
        //    Если таких строк будет много, то вывести первую.
        //    Пример для теста работы программы:
        //    Количество строк: 3
        //    Строка 1: привет
        //    Строка 2: анализ
        //    Строка 3: 111111111111
        //    Ответ: привет
        //
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int row = in.nextInt();
        in.nextLine();
        String[] strArray = new String[row];
        //
        int maxIndex = 0;
        int maxCount = 0;
        String rowAlphabet;
        //
        for (int i = 0; i < strArray.length; i++) {
            System.out.printf("Введите текст в строку %d: ", i+1);
            strArray[i] = in.nextLine();
            //
            rowAlphabet = "";
            for (int j = 0; j < strArray[i].length(); j++) {
                String ch = String.valueOf(strArray[i].charAt(j));
                if (!rowAlphabet.contains(ch)) {
                    rowAlphabet += ch;
                }
            }
            if (rowAlphabet.length() > maxCount) {
                maxCount = rowAlphabet.length();
                maxIndex = i;
            }
        }
        in.close();
        //
        System.out.printf("Ответ: %s%n", strArray[maxIndex]);
    }
}
