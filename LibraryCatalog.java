import java.util.*;
class LibraryCatalog {
    public static void main(String[] args) {
        Map<String,String> books = new TreeMap<>();
        books.put("978-111", "Java Basics");
        books.put("978-222", "Data Structures");
        books.put("978-333", "AI Fundamentals");
        String search = "978-222";
        System.out.println(books.getOrDefault(search, "Book not found"));
        books.remove("978-333");
        books.forEach((k,v)->System.out.println(k+" -> "+v));
    }
}
