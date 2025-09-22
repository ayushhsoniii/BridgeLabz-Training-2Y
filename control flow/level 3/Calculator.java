public class Calculator {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("Simple Calculator (enter q to quit)");
        while (true) {
            System.out.print("Enter first number (or q): ");
            if (sc.hasNext("q")) break;
            if (!sc.hasNextDouble()) {
                System.out.println("Invalid input");
                sc.next(); // consume invalid
                continue;
            }
            double a = sc.nextDouble();

            System.out.print("Enter operator (+ - * / %): ");
            String op = sc.next();

            System.out.print("Enter second number: ");
            if (!sc.hasNextDouble()) {
                System.out.println("Invalid input for second number");
                sc.next(); // consume invalid
                continue;
            }
            double b = sc.nextDouble();

            switch (op) {
                case "+":
                    System.out.println(a + " + " + b + " = " + (a + b));
                    break;
                case "-":
                    System.out.println(a + " - " + b + " = " + (a - b));
                    break;
                case "*":
                    System.out.println(a + " * " + b + " = " + (a * b));
                    break;
                case "/":
                    if (b == 0) {
                        System.out.println("Error: Division by zero");
                    } else {
                        System.out.println(a + " / " + b + " = " + (a / b));
                    }
                    break;
                case "%":
                    if (b == 0) {
                        System.out.println("Error: Modulo by zero");
                    } else {
                        System.out.println(a + " % " + b + " = " + (a % b));
                    }
                    break;
                default:
                    System.out.println("Unsupported operator: " + op);
            }

            sc.nextLine(); // clear rest of line
            System.out.println();
        }

        System.out.println("Calculator exiting.");
        sc.close();
    }
}

