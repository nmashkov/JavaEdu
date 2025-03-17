package com.max.idea;
import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input name: ");

        String name = in.nextLine();

        System.out.println("Input age: ");

        int age = in.nextInt();

        System.out.println("Input height (m.): ");

        float height = in.nextFloat();

        System.out.printf("Name: %s Age: %d Height: %.2f", name, age, height);

    }
}
