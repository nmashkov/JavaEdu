package com.max.idea;

import java.util.Scanner;

public class TaskXII {
    public static void main(String[] args) {
        //    I like Java!!!
        //    1. Проверить, содержит ли строка подстроку “Java” (используйте contains()).
        //    2. Проверить, начинается ли строка с подстроки “I like” (используйте startsWith()).
        //    3. Проверить, заканчивается ли строка с подставки “!!!” (используйте endsWith()).
        //    4. Если 3 предыдущих условия верны, выведите данную строку, преобразованную к верхнему регистру.
        //    5. Замените все символы ‘a’ на ‘о’ и введите подстроку “Jovo” на экран (используйте substring()).
        //
        Scanner in = new Scanner(System.in);
        System.out.println("Введите предложение: ");
        String str = in.nextLine();
        in.close();
        //
        if (str.contains("Java") & str.startsWith("I like") & str.endsWith("!!!")) {
            System.out.println("Верно!");
            System.out.printf("%s%n", str.toUpperCase());
        }
        //
        str = str.replaceAll("a", "o");
        System.out.printf("%s%n", str.substring(7, 11));
    }
}
