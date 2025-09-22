import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base (number): ");
        if (!sc.hasNextDouble()) {
            System.out.println("Invalid base. Exiting.");
            sc.close();
            return;
        }
        double base = sc.nextDouble();

        System.out.print("Enter exponent (integer): ");
        if (!sc.hasNextInt()) {
            System.out.println("Invalid exponent. Exiting.");
            sc.close();
            return;
        }
        int exp = sc.nextInt();
        sc.close();

        if (base == 0.0 && exp <= 0) {
            System.out.println("0 to the power of 0 or negative exponent is undefined.");
            return;
        }

        double result = 1.0;
        int e = Math.abs(exp);
        while (e > 0) {
            result *= base;
            e--;
        }

        if (exp < 0) {
            result = 1.0 / result;
        }

        System.out.println(base + " ^ " + exp + " = " + result);
    }
}

