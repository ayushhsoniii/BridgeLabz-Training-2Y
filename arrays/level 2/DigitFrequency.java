package com.zara.bonus;

import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        String input = sc.next().trim();
        while (!input.matches("-?\\d+")) {
            System.out.print("Invalid input. Enter an integer number: ");
            input = sc.next().trim();
        }

        String digitsStr = input.startsWith("-") ? input.substring(1) : input;
        int[] freq = new int[10];
        for (int i = 0; i < digitsStr.length(); i++) {
            freq[digitsStr.charAt(i) - '0']++;
        }

        System.out.println("\nDigit frequencies:");
        for (int d = 0; d <= 9; d++) {
            System.out.printf("%d : %d%n", d, freq[d]);
        }

        sc.close();
    }
}

