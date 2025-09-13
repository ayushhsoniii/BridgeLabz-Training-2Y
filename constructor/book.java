class book {
    String title;
    String author;
    double price;
    book() {
        title = "sapiens";
        author = "yuval noah harari";
        price = 500.0;
    }

    book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    
}

