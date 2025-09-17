import java.util.Scanner;

class RocketLaunchForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting countdown number: ");
        int number = sc.nextInt();

        for (int i = number; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("Lift Off!");
        sc.close();
    }
}

