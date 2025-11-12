import java.util.*;

class Product {
    private double price;
    Product(double price) { this.price = price; }
    double getPrice() { return price; }
}

class Mobile extends Product { Mobile(double p) { super(p); } }
class Laptop extends Product { Laptop(double p) { super(p); } }

class PriceCalculator {
    static double calculateTotal(List<? extends Product> items) {
        double total = 0;
        for (Product p : items) total += p.getPrice();
        return total;
    }

    public static void main(String[] args) {
        System.out.println(calculateTotal(Arrays.asList(new Mobile(10000), new Laptop(40000))));
    }
}

