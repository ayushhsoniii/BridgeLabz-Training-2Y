import java.util.*;
class WebsiteTracker {
    public static void main(String[] args) {
        String[] pages = {"home","about","products","home","products","contact","home"};
        Map<String,Integer> visits = new HashMap<>();
        for(String p:pages) visits.put(p,visits.getOrDefault(p,0)+1);
        visits.entrySet().stream()
              .sorted((a,b)->b.getValue()-a.getValue())
              .forEach(System.out::println);
        System.out.println("Most visited: "+Collections.max(visits.entrySet(), Map.Entry.comparingByValue()).getKey());
    }
}
