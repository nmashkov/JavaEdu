package com.max.idea;

import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        //    1. Ввести 2 числа с клавиатуры, затем один из символов ‘+’, ‘-’, ‘*’ или ‘/’
        //    2. В зависимости от символа вывести в консоль результат выполнения соответствующей арифметической операции.
        // 1
        Scanner in = new Scanner(System.in);
        System.out.println("Введите два числа через Enter:");
        int x = in.nextInt();
        int y = in.nextInt();
        System.out.println("Введите один из символов ‘+’, ‘-’, ‘*’ или ‘/’:");
        String symbol = in.next();
        in.close();
        // 2
        int result;
        switch (symbol){
            case "+":
                result = x + y;
                System.out.print(x+" + "+y+" = ");
                System.out.print(result);
                break;
            case "-":
                result = x - y;
                System.out.print(x+" - "+y+" = ");
                System.out.print(result);
                break;
            case "*":
                result = x * y;
                System.out.print(x+" * "+y+" = ");
                System.out.print(result);
                break;
            case "/":
                result = x / y;
                System.out.print(x+" / "+y+" = ");
                System.out.print(result);
                break;
        }
    }
}
