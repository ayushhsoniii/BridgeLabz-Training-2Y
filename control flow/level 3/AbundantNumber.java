public class AbundantNumber {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        if (!sc.hasNextLong()) {
            System.out.println("Invalid input");
            sc.close();
            return;
        }

        long n = sc.nextLong();
        if (n <= 0) {
            System.out.println("Please enter a positive integer greater than 0");
            sc.close();
            return;
        }

        java.util.List<Long> divisors = new java.util.ArrayList<>();
        long sum = 0;

        if (n == 1) {
            // proper divisors of 1: none
            sum = 0;
        } else {
            // 1 is always a proper divisor for n>1
            divisors.add(1L);
            sum = 1;
            long limit = (long) Math.sqrt(n);
            for (long i = 2; i <= limit; i++) {
                if (n % i == 0) {
                    long other = n / i;
                    divisors.add(i);
                    if (other != i) divisors.add(other);
                    sum += i;
                    if (other != i) sum += other;
                }
            }
        }

        java.util.Collections.sort(divisors);
        System.out.println("Proper divisors: " + divisors);
        System.out.println("Sum of proper divisors: " + sum);

        if (sum > n) {
            System.out.println(n + " is an Abundant number");
        } else if (sum == n) {
            System.out.println(n + " is a Perfect number");
        } else {
            System.out.println(n + " is a Deficient number");
        }

        sc.close();
    }
}

