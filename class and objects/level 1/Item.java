class Item {
    int itemCode;
    String itemName;
    double price;

    Item(int code, String name, double p) {
        itemCode = code;
        itemName = name;
        price = p;
    }

    void display(int quantity) {
        double totalCost = price * quantity;
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + totalCost);
    }

    
}

