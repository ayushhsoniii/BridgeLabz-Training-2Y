public class LeapYear {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter a year: ");
        if (!sc.hasNextInt()) {
            System.out.println("Invalid input");
            sc.close();
            return;
        }
        int year = sc.nextInt();
        // single if condition using && and ||
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Year is a Leap Year");
        } else {
            System.out.println("Year is not a Leap Year");
        }
        sc.close();
    }
}