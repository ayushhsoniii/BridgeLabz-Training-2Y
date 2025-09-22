public class Harshad {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter an integer: ");
        if (!sc.hasNextLong()) {
            System.out.println("Invalid input");
            sc.close();
            return;
        }

        long n = sc.nextLong();
        String s = Long.toString(n);

        // compute sum of digits (ignore sign) and show steps
        int sum = 0;
        System.out.print("Digits:");
        for (char c : s.toCharArray()) {
            if (c == '-') continue;
            int d = c - '0';
            System.out.print(" " + d);
            sum += d;
        }
        System.out.println();
        System.out.println("Sum of digits: " + sum);

        if (sum == 0) {
            System.out.println(n + " is not a Harshad number (sum of digits is 0)");
        } else if (n % sum == 0) {
            System.out.println(n + " is a Harshad number");
        } else {
            System.out.println(n + " is not a Harshad number");
        }

        sc.close();
    }
}
