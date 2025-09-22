import java.util.Scanner;

public class Factors {
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
        System.out.println("Factors of " + n + ":");
        int i = 1;
        while (i <= m) {
            if (m % i == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}

