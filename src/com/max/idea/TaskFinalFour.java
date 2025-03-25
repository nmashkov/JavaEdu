package com.max.idea;

import java.util.Scanner;

public class TaskFinalFour {
    public static void main(String[] args) {
        //    Напишите программу-загадку: “Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает”.
        //    Ответ: “Заархивированный вирус”.
        //    1. У пользователя есть 3 попытки, чтобы отгадать загадку.
        //    2. Если пользователь ввел верный ответ, вывести: “Правильно!” и завершить работу.
        //    3. Если пользователь ввел неверный ответ на 1 или 2 попытке, вывести “Подумай еще!”
        //    и еще раз запросить ответ у пользователя.
        //    4. Если пользователь сделал 3 неправильных попытки, вывести “Обидно, приходи в другой раз” и завершить работу.
        //    5. Также пользователь имеет право на подсказку при первой попытке,
        //    при этом 2 и 3 попытки уже недоступны.
        //    Если на первой попытке он введет строку “Подсказка”, вывести любую подсказку.
        //    Если на 2 и 3, вывести “Подсказка уже недоступна”.
        //    6. Если пользователь, использовавший подсказку, ошибется,
        //    вывести “Обидно, приходи в другой раз” и завершить работу.
        //
        int try_count = 3;
        String trueAnswer = "заархивированный вирус";
        String help = "запакованный вредитель системы";
        //
        System.out.println("Загадка: ");
        System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает.");
        System.out.printf("Всего %d попытки.%n", try_count);
        //
        String answer;
        boolean takeHelp = false;
        Scanner in = new Scanner(System.in);
        while (try_count != 0) {
            System.out.print("Ваш ответ: ");
            answer = in.nextLine();
            try_count -= 1;
            //
            if (answer.toLowerCase().equals(trueAnswer)) {
                System.out.println("Правильно!");
                break;
            } else {
                System.out.println("Неверно!");
                if (takeHelp) {
                    System.out.println("Обидно, приходи в другой раз и завершить работу.");
                    break;
                }
                switch (try_count) {
                    case 2:
                        System.out.print("Есть подсказка. Введи слово Подсказка, если хочешь воспользоваться, иначе ничего: ");
                        String getHelp = in.nextLine();
                        if (getHelp.equals("Подсказка")) {
                            System.out.println(help);
                            takeHelp = true;
                        }
                        continue;
                    case 1:
                        System.out.println("Подсказка уже недоступна");
                        continue;
                    case 0:
                        System.out.println("Обидно, приходи в другой раз и завершить работу.");
                        break;
                }
            }
        }
        in.close();
    }
}
