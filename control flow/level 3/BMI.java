public class BMI {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter weight in kilograms (kg): ");
        if (!sc.hasNextDouble()) {
            System.out.println("Invalid weight");
            sc.close();
            return;
        }
        double weight = sc.nextDouble();

        System.out.print("Enter height in meters (m): ");
        if (!sc.hasNextDouble()) {
            System.out.println("Invalid height");
            sc.close();
            return;
        }
        double height = sc.nextDouble();

        if (weight <= 0 || height <= 0) {
            System.out.println("Weight and height must be positive numbers");
            sc.close();
            return;
        }

        double bmi = weight / (height * height);

        System.out.printf("BMI = %.2f%n", bmi);

        String category;
        if (bmi < 18.5) {
            category = "Underweight";
        } else if (bmi < 25.0) {
            category = "Normal weight";
        } else if (bmi < 30.0) {
            category = "Overweight";
        } else {
            category = "Obesity";
        }

        System.out.println("Category: " + category);
        sc.close();
    }
}

