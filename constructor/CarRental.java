class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay = 1500; 
    double totalCost;

    
    CarRental() {
        customerName = "Unknown";
        carModel = "Not Selected";
        rentalDays = 0;
        totalCost = 0;
    }

    
    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.totalCost = rentalDays * costPerDay;
    }

    
    CarRental(CarRental other) {
        this.customerName = other.customerName;
        this.carModel = other.carModel;
        this.rentalDays = other.rentalDays;
        this.totalCost = other.totalCost;
    }

    
}

