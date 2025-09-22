import java.util.Scanner;

public class OddEvenArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        while (!sc.hasNextInt()) {
            System.out.print("Invalid input. Enter a positive integer: ");
            sc.next();
        }
        int n = sc.nextInt();
        if (n < 1) {
            System.out.println("Number must be >= 1.");
            sc.close();
            return;
        }

        int evenCount = n / 2;
        int oddCount = n - evenCount;
        int[] evens = new int[evenCount];
        int[] odds = new int[oddCount];

        int ei = 0, oi = 0;
        for (int i = 1; i <= n; i++) {
            if ((i & 1) == 0) evens[ei++] = i;
            else odds[oi++] = i;
        }

        System.out.println();
        System.out.print("Odd numbers: ");
        for (int i = 0; i < odds.length; i++) {
            System.out.print(odds[i] + (i < odds.length - 1 ? ", " : ""));
        }
        System.out.println();

        System.out.print("Even numbers: ");
        for (int i = 0; i < evens.length; i++) {
            System.out.print(evens[i] + (i < evens.length - 1 ? ", " : ""));
        }
        System.out.println();

        sc.close();
    }
}

