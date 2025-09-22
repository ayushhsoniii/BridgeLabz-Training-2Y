public class PrimeCheck {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter an integer: ");
        if (!sc.hasNextLong()) {
            System.out.println("Invalid input");
            sc.close();
            return;
        }
        long n = sc.nextLong();
        if (n <= 1) {
            System.out.println(n + " is not a prime number");
            sc.close();
            return;
        }
        if (n == 2) {
            System.out.println("2 is a prime number");
            sc.close();
            return;
        }
        if (n % 2 == 0) {
            System.out.println(n + " is not a prime number");
            sc.close();
            return;
        }
        long limit = (long) Math.sqrt(n);
        boolean isPrime = true;
        for (long i = 3; i <= limit; i += 2) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(n + (isPrime ? " is a prime number" : " is not a prime number"));
        sc.close();
    }
}

