import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        while (!sc.hasNextInt()) {
            System.out.print("Invalid input. Enter a positive integer: ");
            sc.next();
        }
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Number must be positive.");
            sc.close();
            return;
        }

        String[] results = new String[n];
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) results[i - 1] = "FizzBuzz";
            else if (i % 3 == 0) results[i - 1] = "Fizz";
            else if (i % 5 == 0) results[i - 1] = "Buzz";
            else results[i - 1] = String.valueOf(i);
        }

        // Print in the requested format: Position 1 = 1, Position 2 = 2, Position 3 = Fizz, ...
        for (int i = 0; i < results.length; i++) {
            System.out.print("Position " + (i + 1) + " = " + results[i]);
            if (i < results.length - 1) System.out.print(", ");
        }
        System.out.println();

        sc.close();
    }
}