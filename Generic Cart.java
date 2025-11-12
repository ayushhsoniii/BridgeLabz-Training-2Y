import java.util.*;

class Cart<T> {
    List<T> items = new ArrayList<>();
    void addItem(T item) { items.add(item); }
    void removeItem(T item) { items.remove(item); }
    void displayItems() { items.forEach(System.out::println); }

    public static void main(String[] args) {
        Cart<String> clothes = new Cart<>();
        clothes.addItem("Shirt");
        clothes.addItem("Jeans");
        clothes.displayItems();

        Cart<Integer> electronics = new Cart<>();
        electronics.addItem(1234);
        electronics.displayItems();
    }
}

