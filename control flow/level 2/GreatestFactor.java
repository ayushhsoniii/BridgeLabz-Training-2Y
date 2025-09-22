import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        if (!sc.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            sc.close();
            return;
        }

        int n = sc.nextInt();
        sc.close();

        if (n == 0) {
            System.out.println("0 has infinitely many factors.");
            return;
        }

        int m = Math.abs(n);
        if (m == 1) {
            System.out.println("1 has no proper factor beside itself.");
            return;
        }

        int greatest = 1; // 1 is always a factor for integers > 1
        int i = m / 2;
        while (i >= 1) {
            if (m % i == 0) {
                greatest = i;
                break;
            }
            i--;
        }

        System.out.println("Greatest factor of " + n + " beside itself: " + greatest);
    }
}