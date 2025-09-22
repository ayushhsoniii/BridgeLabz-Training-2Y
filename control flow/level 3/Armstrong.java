public class Armstrong {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        if (!sc.hasNextLong()) {
            System.out.println("Invalid input");
            sc.close();
            return;
        }

        long n = sc.nextLong();
        if (n < 0) {
            System.out.println(n + " is not an Armstrong number (negative numbers not supported)");
            sc.close();
            return;
        }

        // Keep original value for final comparison
        long original = n;

        // Step 1: count digits (handle 0 as a single-digit number)
        int digits = 1;
        long temp = n;
        if (temp == 0) {
            digits = 1;
        } else {
            digits = 0;
            while (temp > 0) {
                digits++;
                temp /= 10;
            }
        }
        System.out.println("Number of digits: " + digits);

        // Step 2: compute sum of each digit raised to 'digits'
        long sum = 0;
        temp = n;
        if (temp == 0) {
            // special-case to show the step for 0
            long p = 0; // 0^digits == 0
            System.out.println("Digit: 0 ^ " + digits + " = " + p);
            sum += p;
        } else {
            while (temp > 0) {
                int digit = (int)(temp % 10);

                // integer power: digit^digits (avoid floating point Math.pow)
                long power = 1;
                for (int i = 0; i < digits; i++) {
                    power *= digit;
                }

                // show the step
                System.out.println("Digit: " + digit + " ^ " + digits + " = " + power);

                sum += power;
                temp /= 10;
            }
        }

        // Step 3: show result and comparison
        System.out.println("Sum of digits^" + digits + " = " + sum);
        if (sum == original) {
            System.out.println(original + " is an Armstrong number");
        } else {
            System.out.println(original + " is not an Armstrong number");
        }

        sc.close();
    }
}

