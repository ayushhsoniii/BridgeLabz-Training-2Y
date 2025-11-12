abstract class ProductBase {
    private double price;
    void setPrice(double price) { this.price = price; }
    double getPrice() { return price; }
}

class Book extends ProductBase {}
class Clothing extends ProductBase {}
class Gadget extends ProductBase {}

class Marketplace {
    static <T extends ProductBase> void applyDiscount(T product, double percent) {
        product.setPrice(product.getPrice() * (1 - percent / 100));
    }

    public static void main(String[] args) {
        Book b = new Book(); b.setPrice(200);
        applyDiscount(b, 10);
        System.out.println(b.getPrice());
    }
}

