class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }


    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: ₹" + salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Ayush", 101, 50000);
        e1.displayDetails();
    }
}
