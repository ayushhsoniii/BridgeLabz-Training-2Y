class MobilePhone {
    String brand;
    String model;
    double price;

    MobilePhone(String b, String m, double p) {
        brand = b;
        model = m;
        price = p;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

}    
