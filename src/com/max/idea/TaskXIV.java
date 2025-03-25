package com.max.idea;

import java.util.Random;

public class TaskXIV {
    public static void main(String[] args) {
        //    Напишите программу, заполняющую массив из 15 элементов рандомными значениями в диапазоне от -20 до 20.
        //    Далее:
        //    1. Выведите максимальный и минимальный элемент массива.
        //    2. Из максимального и минимального значения выведите наибольшее по модулю.
        //
        Random random = new Random();
        int size = 15;
        int[] intArray = new int[size];
        int max = -20;
        int min = 20;
        // true - "+" or 1, false - "-" or -1
        boolean symbol;
        int symbolInt;
        //
        for (int i = 0; i < size; i++) {
            symbol = random.nextBoolean();
            if (symbol) {
                symbolInt = 1;
            } else {
                symbolInt = -1;
            }
            intArray[i] = random.nextInt(21) * symbolInt;
            System.out.printf("%d ", intArray[i]);
            //
            max = Math.max(max, intArray[i]);
            min = Math.min(min, intArray[i]);
        }
        //
        System.out.println();
        System.out.printf("max = %d%n", max);
        System.out.printf("min = %d%n", min);
        int maxAbs = Math.max(Math.abs(max), Math.abs(min));
        System.out.printf("maxAbs = %d%n", maxAbs);
    }
}
