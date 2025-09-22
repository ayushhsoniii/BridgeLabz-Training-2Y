import java.util.Scanner;

public class MultiplicationTable6to9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        while (true) {
            System.out.print("Enter an integer between 6 and 9: ");
            if (!sc.hasNextInt()) {
                System.out.print("Invalid input. ");
                sc.next();
                continue;
            }
            n = sc.nextInt();
            if (n >= 6 && n <= 9) break;
            System.out.println("Number must be between 6 and 9.");
        }

        System.out.println();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", n, i, n * i);
        }

        sc.close();
    }
}

