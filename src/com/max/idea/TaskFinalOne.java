package com.max.idea;

import java.util.Scanner;

public class TaskFinalOne {
    public static void main(String[] args) {
        //    Напишите программу конвертер валют. Программа должна переводить рубли в доллары по текущему курсу.
        //    Пользователь вводит текущий курс и количество рублей.
        //    Итоговое значение должно быть округлено до двух знаков после запятой.
        //    Пример для теста работы программы:
        //    - Курс доллара: 67,55
        //    - Количество рублей: 1000
        //    - Итого: 14,80 долларов
        //
        Scanner in = new Scanner(System.in);
        System.out.print("Введите текущий курс: ");
        double exchange = in.nextDouble();
        while (exchange == 0) {
            System.out.print("Курс не может быть нулевым (0), введите ещё раз: ");
            exchange = in.nextDouble();
        }
        //
        System.out.print("Введите количество рублей: ");
        int rubSum = in.nextInt();
        while (rubSum == 0) {
            System.out.print("Количество не может быть нулевым (0), введите ещё раз: ");
            rubSum = in.nextInt();
        }
        in.close();
        //
        double dollarTotal = rubSum / exchange;
        System.out.printf("Курс доллара: %.2f%n", exchange);
        System.out.printf("Количество рублей: %d%n", rubSum);
        System.out.printf("Итого: %.2f долларов%n", dollarTotal);
    }
}
