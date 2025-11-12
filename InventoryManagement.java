import java.util.*;
class InventoryManagement {
    public static void main(String[] args) {
        Map<String, Integer> stock = new HashMap<>();
        stock.put("Apple", 10);
        stock.put("Banana", 5);
        stock.put("Milk", 0);
        stock.computeIfPresent("Apple", (k,v) -> v-3);
        stock.put("Banana", stock.get("Banana")+5);
        stock.entrySet().removeIf(e -> e.getValue() <= 0);
        System.out.println("Stock: " + stock);
    }
}

