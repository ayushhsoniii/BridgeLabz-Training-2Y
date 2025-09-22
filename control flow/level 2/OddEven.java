import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        if (!sc.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            sc.close();
            return;
        }

        int n = sc.nextInt();
        sc.close();

        if (n < 1) {
            System.out.println("Please enter a number >= 1.");
            return;
        }

        System.out.println("Even numbers from 1 to " + n + ":");
        for (int i = 2; i <= n; i += 2) {
            System.out.print(i + (i + 2 <= n ? " " : ""));
        }
        System.out.println(); // newline

        System.out.println("Odd numbers from 1 to " + n + ":");
        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + (i + 2 <= n ? " " : ""));
        }
        System.out.println();
    }
}

