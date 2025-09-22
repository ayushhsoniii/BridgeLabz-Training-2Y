import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer to print its multiplication table: ");
        while (!sc.hasNextInt()) {
            System.out.print("Invalid input. Enter an integer: ");
            sc.next();
        }
        int n = sc.nextInt();

        System.out.print("Enter table size (press Enter for default 10): ");
        int size = 10;
        String next = sc.nextLine(); // consume end of line
        String maybeSize = sc.nextLine().trim();
        if (!maybeSize.isEmpty()) {
            try {
                int parsed = Integer.parseInt(maybeSize);
                if (parsed > 0) size = parsed;
            } catch (NumberFormatException ignored) { /* keep default */ }
        }

        System.out.println();
        for (int i = 1; i <= size; i++) {
            System.out.printf("%d x %d = %d%n", n, i, n * i);
        }

        sc.close();
    }
}

