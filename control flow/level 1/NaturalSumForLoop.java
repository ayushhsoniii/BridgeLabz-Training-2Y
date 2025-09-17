import java.util.Scanner;

class NaturalSumForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a positive number n: ");
        int n = sc.nextInt();
        
        int sum = 0;
        
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        
        System.out.println("Sum using for loop: " + sum);
        
        int formulaSum = n * (n + 1) / 2;
        System.out.println("Sum using formula n*(n+1)/2: " + formulaSum);
        
        if (sum == formulaSum) {
            System.out.println("Both computations are correct.");
        } else {
            System.out.println("There is an error in computations.");
        }
        
        sc.close();
    }
}


