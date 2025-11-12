import java.util.*;
class EmployeeSalary {
    public static void main(String[] args) {
        Map<String,Double> emp = new HashMap<>();
        emp.put("Ayush",50000.0);
        emp.put("Neha",60000.0);
        emp.put("Rahul",45000.0);
        emp.computeIfPresent("Neha",(k,v)->v*1.1);
        double avg = emp.values().stream().mapToDouble(Double::doubleValue).average().orElse(0);
        double max = Collections.max(emp.values());
        System.out.println("Average: "+avg);
        emp.entrySet().stream().filter(e->e.getValue()==max).forEach(System.out::println);
    }
}

