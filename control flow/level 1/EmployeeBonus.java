import java.util.Scanner;

class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = sc.nextLine();

        System.out.print("Enter years of service: ");
        int years = sc.nextInt();

        System.out.print("Enter current salary: ");
        double salary = sc.nextDouble();

        double bonus = 0;

        if (years >= 10) {
            bonus = salary * 0.20; // 20% bonus for 10 or more years
        } else if (years >= 5) {
            bonus = salary * 0.10; // 10% bonus for 5-9 years
        } else if (years >= 2) {
            bonus = salary * 0.05; // 5% bonus for 2-4 years
        } else {
            bonus = 0; // No bonus for less than 2 years
        }

        System.out.println("\nEmployee: " + name);
        System.out.println("Years of service: " + years);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + bonus);

        sc.close();
    }
}

