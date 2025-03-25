package com.max.idea;

import java.util.Scanner;

public class TaskX {
    public static void main(String[] args) {
        //    Напишите программу, где пользователь вводит данные с клавиатуры в матрицу,
        //    а после этого произведите вывод первой строки матрицы на экран,
        //    где каждый элемент умножается на 3. Размерность матрицы задается пользователем.
        //
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк в матрице: ");
        int row = in.nextInt();
        System.out.print("Введите количество столбцов в матрице: ");
        int attr  = in.nextInt();
        double[][] doubleArray = new double[row][attr];
        for (int i = 0; i < doubleArray.length; i++) {
            System.out.printf("Введите данные в массив через Enter для строки %d:%n", i+1);
            for (int j=0; j < doubleArray[i].length; j++) {
                doubleArray[i][j] = in.nextDouble();
            }
        }
        in.close();
        //
        System.out.println("Матрица: ");
        for (double[] doubles : doubleArray) {
            for (double aDouble : doubles) {
                System.out.printf("%.3f ", aDouble);
            }
            System.out.println();
        }
        //
        System.out.println("Вывод первой строки матрицы на экран, где каждый элемент умножается на 3: ");
        for (int i = 0; i < doubleArray[0].length; i++) {
            System.out.printf("%.3f ", doubleArray[0][i] * 3);
        }
    }
}
