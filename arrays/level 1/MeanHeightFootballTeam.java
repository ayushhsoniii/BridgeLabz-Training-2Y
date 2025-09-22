import java.util.Scanner;

public class MeanHeightFootballTeam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int PLAYERS = 11;
        double[] heights = new double[PLAYERS];
        double sum = 0.0;

        for (int i = 0; i < PLAYERS; i++) {
            double h;
            System.out.print("Enter height of player " + (i + 1) + " in cm: ");
            while (true) {
                if (!sc.hasNextDouble()) {
                    System.out.print("Invalid input. Enter a numeric height in cm: ");
                    sc.next();
                    continue;
                }
                h = sc.nextDouble();
                if (h <= 0) {
                    System.out.print("Height must be positive. Enter again: ");
                    continue;
                }
                break;
            }
            heights[i] = h;
            sum += h;
        }

        double mean = sum / PLAYERS;
        System.out.println();
        System.out.printf("Mean height of the team = %.2f cm (%.2f m)%n", mean, mean / 100.0);

        sc.close();
    }
}

