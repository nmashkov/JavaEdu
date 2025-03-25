package com.max.idea;

import java.util.Scanner;

public class TaskNine {
    public static void main(String[] args) {
        //    1. Пользователь вводит размер массива и данные с клавиатуры в массив типа double.
        //    2. Посчитайте среднее арифметическое элементов массива.
        //    3. После этого произведите вывод массива на экран, где каждый элемент массива умножается на среднее арифметическое
        //
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = in.nextInt();
        double[] doubleArray = new double[size];
        System.out.println("Введите данные в массив через Enter: ");
        for (int i = 0; i < doubleArray.length; i++) {
            doubleArray[i] = in.nextDouble();
        }
        in.close();
        //
        double avg = 0;
        for (double el : doubleArray) {
            avg += el;
        }
        avg /= size;
        System.out.printf("среднее арифметическое элементов массива: %f%n", avg);
        //
        for (double el : doubleArray) {
            System.out.print(el * avg + " ");
        }
    }
}
