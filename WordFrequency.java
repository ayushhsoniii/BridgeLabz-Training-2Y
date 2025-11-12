import java.util.*;
class WordFrequency {
    public static void main(String[] args) {
        String s = "Java is fun and Java is powerful";
        s = s.toLowerCase().replaceAll("[^a-z ]","");
        Map<String,Integer> map = new HashMap<>();
        for(String w:s.split("\\s+")) map.put(w,map.getOrDefault(w,0)+1);
        map.forEach((k,v)->System.out.println(k+"="+v));
    }
}

