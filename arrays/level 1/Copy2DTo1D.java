import java.util.Scanner;
import java.util.Arrays;

public class Copy2DTo1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        while (!sc.hasNextInt()) { System.out.print("Enter a valid integer for rows: "); sc.next(); }
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        while (!sc.hasNextInt()) { System.out.print("Enter a valid integer for columns: "); sc.next(); }
        int cols = sc.nextInt();

        if (rows <= 0 || cols <= 0) {
            System.out.println("Rows and columns must be positive.");
            sc.close();
            return;
        }

        int[][] matrix = new int[rows][cols];
        System.out.println("Enter elements (row by row):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("Element [%d][%d]: ", i, j);
                while (!sc.hasNextInt()) { System.out.print("Enter an integer: "); sc.next(); }
                matrix[i][j] = sc.nextInt();
            }
        }

        // copy to 1D array (row-major)
        int[] flat = new int[rows * cols];
        int idx = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                flat[idx++] = matrix[i][j];
            }
        }

        System.out.println();
        System.out.println("2D array:");
        for (int i = 0; i < rows; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }

        System.out.println("1D (flattened) array:");
        System.out.println(Arrays.toString(flat));

        sc.close();
    }
}


