package com.zara.bonus;

import java.util.Arrays;
import java.util.Scanner;

public class DigitsArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        String input = sc.next().trim();

        while (!input.matches("-?\\d+")) {
            System.out.print("Invalid input. Enter an integer number: ");
            input = sc.next().trim();
        }

        String digitsStr = input.replaceFirst("^-", ""); // remove minus if present
        int len = digitsStr.length();

        // start with initial capacity (maxDigit) = 10
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int count = 0;

        for (int i = 0; i < len; i++) {
            // if we've filled the array, increase size by 10
            if (count == maxDigit) {
                int newMax = maxDigit + 10;
                int[] tmp = new int[newMax];
                System.arraycopy(digits, 0, tmp, 0, maxDigit);
                digits = tmp;
                maxDigit = newMax;
            }
            digits[count++] = digitsStr.charAt(i) - '0';
        }

        // trim to actual size
        digits = Arrays.copyOf(digits, count);

        // find largest and second largest distinct digits
        int largest = -1;
        int secondLargest = -1;
        for (int d : digits) {
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d != largest && d > secondLargest) {
                secondLargest = d;
            }
        }

        System.out.println("Digits array: " + Arrays.toString(digits));
        System.out.println("Largest digit: " + largest);
        if (secondLargest == -1) {
            System.out.println("No second largest digit (all digits equal or only one unique digit).");
        } else {
            System.out.println("Second largest digit: " + secondLargest);
        }

        sc.close();
    }
}

