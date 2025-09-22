import java.util.Scanner;

public class StoreNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int MAX = 10;
        int[] values = new int[MAX];
        int count = 0;
        int sum = 0;

        for (int i = 0; i < MAX; i++) {
            System.out.print("Enter number (0 or negative to stop): ");
            while (!sc.hasNextInt()) {
                System.out.print("Invalid input. Enter an integer: ");
                sc.next();
            }
            int v = sc.nextInt();
            if (v <= 0) break;
            values[count++] = v;
            sum += v;
        }

        System.out.println();
        if (count == 0) {
            System.out.println("No positive numbers were entered.");
        } else {
            System.out.println("Numbers entered:");
            for (int i = 0; i < count; i++) {
                System.out.print(values[i] + (i < count - 1 ? ", " : ""));
            }
            System.out.println();
            System.out.println("Count: " + count);
            System.out.println("Sum: " + sum);
        }

        sc.close();
    }
}

