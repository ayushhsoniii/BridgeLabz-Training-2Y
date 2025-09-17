public class MovieTicket {
    private String movieName;
    private String seatNumber;
    private double price;
    private boolean booked;

    public MovieTicket(String movieName) {
        this.movieName = movieName;
        this.seatNumber = null;
        this.price = 0.0;
        this.booked = false;
    }

    
    public void bookTicket(String seatNumber, double price) {
        if (booked) {
            System.out.println("Ticket already booked for seat: " + this.seatNumber);
            return;
        }
        this.seatNumber = seatNumber;
        this.price = price;
        this.booked = true;
    }


    public void displayTicketDetails() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat: " + (seatNumber != null ? seatNumber : "Not booked"));
        System.out.printf("Price: $%.2f%n", price);
    }

    public String getMovieName() { return movieName; }
    public String getSeatNumber() { return seatNumber; }
    public double getPrice() { return price; }
    public boolean isBooked() { return booked; }
}