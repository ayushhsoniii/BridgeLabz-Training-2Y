public class CountDigits {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter an integer: ");
        if (!sc.hasNextLong()) {
            System.out.println("Invalid input");
            sc.close();
            return;
        }
        long n = sc.nextLong();

        // Use string to handle sign and avoid overflow for Long.MIN_VALUE
        String s = Long.toString(n);
        int digits = (s.charAt(0) == '-') ? s.length() - 1 : s.length();

        System.out.println("Number of digits: " + digits);
        sc.close();
    }
}

