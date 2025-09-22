import java.util.Scanner;

public class CheckNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = 5;
        int[] nums = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            while (!sc.hasNextInt()) {
                System.out.print("Invalid input. Enter an integer: ");
                sc.next();
            }
            nums[i] = sc.nextInt();
        }

        System.out.println();
        for (int i = 0; i < N; i++) {
            int v = nums[i];
            if (v > 0) {
                System.out.printf("Element %d (%d) is positive and %s.%n", i + 1, v, (v % 2 == 0) ? "even" : "odd");
            } else if (v < 0) {
                System.out.printf("Element %d (%d) is negative.%n", i + 1, v);
            } else {
                System.out.printf("Element %d (%d) is zero.%n", i + 1, v);
            }
        }

        int first = nums[0], last = nums[N - 1];
        System.out.println();
        if (first == last) {
            System.out.printf("First element (%d) is equal to last element (%d).%n", first, last);
        } else if (first > last) {
            System.out.printf("First element (%d) is greater than last element (%d).%n", first, last);
        } else {
            System.out.printf("First element (%d) is less than last element (%d).%n", first, last);
        }

        sc.close();
    }
}

