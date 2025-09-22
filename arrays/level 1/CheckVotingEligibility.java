import java.util.Scanner;

public class CheckVotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            while (!sc.hasNextInt()) {
                System.out.print("Invalid input. Enter an integer for age: ");
                sc.next();
            }
            ages[i] = sc.nextInt();
        }

        System.out.println();
        for (int i = 0; i < ages.length; i++) {
            String result = (ages[i] >= 18) ? "can vote." : "cannot vote.";
            System.out.printf("Student %d (Age: %d) %s%n", i + 1, ages[i], result);
        }
        sc.close();
    }
}