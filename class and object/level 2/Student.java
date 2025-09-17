class Student {
    String name;
    int rollNumber;
    double marks;

    Student(String n, int r, double m) {
        name = n;
        rollNumber = r;
        marks = m;
    }

    String calculateGrade() {
        if (marks >= 90) return "A";
        else if (marks >= 75) return "B";
        else if (marks >= 50) return "C";
        else return "D";
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }

    public static void main(String[] args) {
        Student s1 = new Student("Ayush", 101, 88);
        Student s2 = new Student("Anjali", 102, 47);

        s1.display();
        System.out.println();
        s2.display();
    }
}
