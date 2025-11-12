import java.util.*;
class StudentGradeTracker {
    public static void main(String[] args) {
        Map<String, Double> grades = new TreeMap<>();
        grades.put("Ayush", 85.0);
        grades.put("Priya", 90.0);
        grades.put("Rahul", 70.0);
        grades.put("Priya", 95.0);
        grades.remove("Rahul");
        grades.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}

