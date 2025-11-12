import java.util.*;

abstract class WarehouseItem { public String toString() { return getClass().getSimpleName(); } }
class Electronics extends WarehouseItem {}
class Groceries extends WarehouseItem {}
class Furniture extends WarehouseItem {}

class Storage<T extends WarehouseItem> {
    List<T> items = new ArrayList<>();
    void addItem(T item) { items.add(item); }
    List<T> getItems() { return items; }

    static void displayAll(List<? extends WarehouseItem> list) {
        for (WarehouseItem i : list) System.out.println(i);
    }

    public static void main(String[] args) {
        Storage<Electronics> s = new Storage<>();
        s.addItem(new Electronics());
        displayAll(s.getItems());
    }
}
