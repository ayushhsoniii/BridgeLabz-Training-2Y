package com.zara.bonus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Friends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        System.out.println("Enter age (years) and height (cm) for Amar, Akbar, Anthony:");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%s - age: ", names[i]);
            ages[i] = readInt(sc);
            System.out.printf("%s - height (cm): ", names[i]);
            heights[i] = readDouble(sc);
        }

        int minAge = Integer.MAX_VALUE;
        double maxHeight = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < 3; i++) {
            if (ages[i] < minAge) minAge = ages[i];
            if (heights[i] > maxHeight) maxHeight = heights[i];
        }

        List<String> youngest = new ArrayList<>();
        List<String> tallest = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            if (ages[i] == minAge) youngest.add(names[i]);
            if (Double.compare(heights[i], maxHeight) == 0) tallest.add(names[i]);
        }

        System.out.println();
        System.out.printf("Youngest age: %d - %s%n", minAge, String.join(", ", youngest));
        System.out.printf("Tallest height: %.2f cm - %s%n", maxHeight, String.join(", ", tallest));

        sc.close();
    }

    private static int readInt(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.print("Please enter a valid integer: ");
            sc.next();
        }
        return sc.nextInt();
    }

    private static double readDouble(Scanner sc) {
        while (!sc.hasNextDouble()) {
            System.out.print("Please enter a valid number: ");
            sc.next();
        }
        return sc.nextDouble();
    }
}

