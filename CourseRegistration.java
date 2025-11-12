import java.util.*;
class CourseRegistration {
    public static void main(String[] args) {
        Map<String,Integer> courses = new HashMap<>();
        courses.put("CS101", 45);
        courses.put("AI102", 60);
        courses.put("DB103", 3);
        courses.compute("AI102",(k,v)->v-5);
        courses.forEach((k,v)->System.out.println(k+"="+v));
        System.out.println("Near Full: ");
        courses.entrySet().stream().filter(e->e.getValue()>=50).forEach(System.out::println);
    }
}
