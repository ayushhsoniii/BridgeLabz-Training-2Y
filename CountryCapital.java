import java.util.*;
class CountryCapital {
    public static void main(String[] args) {
        Map<String,String> map = new TreeMap<>();
        map.put("India","New Delhi");
        map.put("USA","Washington");
        map.put("France","Paris");
        map.put("Japan","Tokyo");
        String country = "India";
        System.out.println(map.getOrDefault(country,"Unknown country"));
        map.forEach((k,v)->System.out.println(k+" - "+v));
    }
}

