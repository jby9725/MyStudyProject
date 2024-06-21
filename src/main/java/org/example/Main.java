package org.example;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        String[] numbers = str.split(" ");

        long num1 = Long.parseLong(numbers[0]);
        long num2 = Long.parseLong(numbers[1]);
        long num3 = Long.parseLong(numbers[2]);

        long sum = num1 + num2 + num3;

        System.out.println(sum);

        scanner.close();
    }
}