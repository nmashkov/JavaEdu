package com.max.idea;

import java.util.Scanner;

public class TaskSeven {
    public static void main(String[] args) {
        //    1. Пользователь вводит размер массива и данные с клавиатуры в массив
        //
        //    2. Сравнить элементы массива с заранее заданными константами x, y, z.
        //
        //    3. Если массив содержит хотя бы одну из констант, вывести текст "Данное значение имеется в константах".
        // 1
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = in.nextInt();
        int[] intArray = new int[size];
        System.out.println("Введите данные в массив через Enter: ");
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = in.nextInt();
        }
        in.close();
        // 2, 3
        int x = 10;
        int y = 0;
        int z = 5;
        for (int el : intArray) {
            if (el == x | el == y | el == z) {
                System.out.printf("Данное значение имеется в константах: %d%n", el);
                break;
            }
        }
    }
}
