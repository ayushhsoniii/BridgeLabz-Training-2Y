package com.zara.bonus;

import java.util.Locale;
import java.util.Scanner;

public class BMI {
    private static class Person {
        String name;
        double heightM;
        double weightKg;
        double bmi;
        String status;

        Person(String name, double heightM, double weightKg) {
            this.name = name;
            this.heightM = heightM;
            this.weightKg = weightKg;
            this.bmi = calcBmi();
            this.status = bmiStatus();
        }

        private double calcBmi() {
            if (heightM <= 0) return 0;
            return weightKg / (heightM * heightM);
        }

        private String bmiStatus() {
            if (bmi < 18.5) return "Underweight";
            if (bmi < 25.0) return "Normal";
            if (bmi < 30.0) return "Overweight";
            return "Obese";
        }
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of people in the team: ");
        int n = readInt(sc);
        Person[] team = new Person[n];

        System.out.println("Enter each person's name, height (cm) and weight (kg).");
        for (int i = 0; i < n; i++) {
            System.out.printf("Person %d name: ", i + 1);
            String name = sc.next().trim();

            System.out.printf("Person %d height (cm): ", i + 1);
            double heightCm = readDouble(sc);
            double heightM = heightCm / 100.0;

            System.out.printf("Person %d weight (kg): ", i + 1);
            double weightKg = readDouble(sc);

            team[i] = new Person(name, heightM, weightKg);
        }

        System.out.println();
        System.out.printf("%-15s %-8s %-8s %-7s %-12s%n", "Name", "Height(m)", "Weight", "BMI", "Status");
        for (Person p : team) {
            System.out.printf("%-15s %8.2f %8.2f %7.2f %-12s%n",
                    p.name, p.heightM, p.weightKg, p.bmi, p.status);
        }

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

