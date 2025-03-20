package com.max.idea;

public class TaskThree {
    public static void main(String[] args) {
//        1. Задайте массив из 5 любых целых чисел
//
//        2. Поменяйте местами первый и последний элемент в массиве
//
//        3. Вывести в консоль результат суммы первого и среднего элемента
//
//        Примечание: Для получения последнего и среднего элементов в массиве используйте свойство length.
        int[] intArray = {1, 2, 3, 4, 5};

        intArray[0] = intArray[intArray.length-1] - intArray[0];
        intArray[intArray.length-1] -= intArray[0];
        intArray[0] += intArray[intArray.length-1];

        int sum = intArray[0] + intArray[(intArray.length - 1) / 2];

        System.out.print("Сумма первого и среднего элемента: ");
        System.out.print(sum);
    }
}
