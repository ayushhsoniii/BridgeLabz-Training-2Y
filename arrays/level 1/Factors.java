import java.util.*;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        while (!sc.hasNextInt()) {
            System.out.print("Invalid input. Enter an integer: ");
            sc.next();
        }
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Number must be positive.");
            sc.close();
            return;
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
                int other = n / i;
                if (other != i) list.add(other);
            }
        }
        Collections.sort(list);

        int[] factors = new int[list.size()];
        for (int i = 0; i < list.size(); i++) factors[i] = list.get(i);

        System.out.println();
        System.out.print("Factors: ");
        for (int i = 0; i < factors.length; i++) {
            System.out.print(factors[i] + (i < factors.length - 1 ? ", " : ""));
        }
        System.out.println();

        sc.close();
    }
}

