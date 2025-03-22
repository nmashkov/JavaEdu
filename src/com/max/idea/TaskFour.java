package com.max.idea;

import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        //    1. Ввести три числа с клавиатуры x, y, z
        //    2. Найти и вывести в консоль среднее арифметическое этих чисел
        //    3. Разделить среднее арифметическое на 2 и округлить в меньшую сторону
        //    4. Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"
        // 1
        Scanner in = new Scanner(System.in);
        System.out.println("Введите три числа через Enter:");
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        in.close();
        // 2
        int avg = (x + y + z) / 3;
        System.out.println("Их среднее арифметическое: "+avg);
        // 3, 4
        String result = (avg / 2 > 3) ? "Программа выполнена корректно" : "";
        System.out.println(result);
    }
}
