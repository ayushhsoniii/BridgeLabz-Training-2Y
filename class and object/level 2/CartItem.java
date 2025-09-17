public class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    public CartItem(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = 0;
    }

    
    public void addItem(int qty) {
        if (qty <= 0) {
            System.out.println("addItem: quantity must be positive.");
            return;
        }
        this.quantity += qty;
    }

    
    public void removeItem(int qty) {
        if (qty <= 0) {
            System.out.println("removeItem: quantity must be positive.");
            return;
        }
        this.quantity = Math.max(0, this.quantity - qty);
    }

    
    public double getTotalCost() {
        return this.price * this.quantity;
    }

   
    public void displayTotalCost() {
        System.out.printf("Item: %s | Quantity: %d | Unit Price: $%.2f | Total: $%.2f%n",
                          itemName, quantity, price, getTotalCost());
    }

    
   
}

