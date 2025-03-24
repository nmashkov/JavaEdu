package com.max.idea;

import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {
        //    1. Пользователю предлагается на выбор ввести массу или расстояние. Пример:
        //    > Выберите что переводить: 1 - масса, 2 - расстояние
        //    > 2
        //    2. Пользователю предлагается выбрать единицу измерения. Пример:
        //    > Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут
        //    > 1
        //    3. Пользователю предлагается ввести количество выбранных единиц:
        //    > Введите число
        //    > 10
        //    > Результат:
        //    > Метры: 10
        //    > Мили: 0.006
        //    > Ярды: 10.94
        //    > Футы: 32.81
        //
        // Init
        Scanner in = new Scanner(System.in);
        int type;
        int measure;
        int number;
        //
        System.out.print("Выберите что переводить: 1 - масса, 2 - расстояние: ");
        type = in.nextInt();
        // масса
        if (type == 1) {
            double kg = 0;
            double lb = 0;
            double oz = 0;
            System.out.print("Выберите единицу измерения: 1 - килограмм, 2 - фунт, 3 - унция: ");
            measure = in.nextInt();
            System.out.print("Введите число: ");
            number = in.nextInt();
            switch (measure){
                case 1:
                    kg = number;
                    lb = kg * 2.205;
                    oz = kg * 35.27;
                    break;
                case 2:
                    lb = number;
                    kg = lb * (1 / 2.205);
                    oz = kg * 35.27;
                    break;
                case 3:
                    oz = number;
                    kg = oz * (1 / 35.27);
                    lb = kg * 2.205;
                    break;
                default:
                    System.out.println("Выбрана неверная единица измерения.");
                    break;
            }
            // print result
            System.out.println("Результат:");
            System.out.printf("Килограммы: %.2f%n", kg);
            System.out.printf("Фунты: %.2f%n", lb);
            System.out.printf("Унции: %.2f%n", oz);
        // расстояние
        } else if (type == 2) {
            double meter = 0;
            double mile = 0;
            double yd = 0;
            double ft = 0;
            System.out.print("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут: ");
            measure = in.nextInt();
            System.out.print("Введите число: ");
            number = in.nextInt();
            switch (measure){
                case 1:
                    meter = number;
                    mile = meter * 0.0006214;
                    yd = meter * 1.094;
                    ft = meter * 3.281;
                    break;
                case 2:
                    mile = number;
                    meter = number * (1 / 0.0006214);
                    yd = meter * 1.094;
                    ft = meter * 3.281;
                    break;
                case 3:
                    yd = number;
                    meter = yd * (1 / 1.094);
                    mile = meter * 0.0006214;
                    ft = meter * 3.281;
                    break;
                case 4:
                    ft = number;
                    meter = meter * (1 / 3.281);
                    mile = meter * 0.0006214;
                    yd = meter * 1.094;
                    break;
                default:
                    System.out.println("Выбрана неверная единица измерения.");
                    break;
            }
            // print result
            System.out.println("Результат:");
            System.out.printf("Метры: %.2f%n", meter);
            System.out.printf("Мили: %.2f%n", mile);
            System.out.printf("Ярды: %.2f%n", yd);
            System.out.printf("Футы: %.2f%n", ft);
        } else {
            System.out.println("Выбрана неверная мера для перевода.");
        }
        in.close();
    }
}
