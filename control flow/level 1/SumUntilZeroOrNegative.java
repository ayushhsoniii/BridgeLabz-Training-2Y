import java.util.Scanner;

class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int number;

        System.out.println("Enter numbers (enter 0 or a negative number to stop):");

        while (true) {
            number = sc.nextInt();
            if (number <= 0) {
                break;
            }
            sum += number;
        }

        System.out.println("Sum of numbers = " + sum);
        sc.close();
    }
}

