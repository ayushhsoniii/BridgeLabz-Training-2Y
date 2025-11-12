import java.util.*;
class Employee {
    String name, dept;
    Employee(String n, String d) { name = n; dept = d; }
    public String toString() { return name; }
}
class GroupByDepartment {
    public static void main(String[] args) {
        List<Employee> list = List.of(new Employee("Alice","HR"), new Employee("Bob","IT"), new Employee("Carol","HR"));
        Map<String, List<Employee>> grouped = new HashMap<>();
        for (Employee e : list)
            grouped.computeIfAbsent(e.dept, k -> new ArrayList<>()).add(e);
        System.out.println(grouped);
    }
}

