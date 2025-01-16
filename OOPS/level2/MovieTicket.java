public class MovieTicket {

    String movieName;
    int seatNumber;
    int price;

    MovieTicket(String movieName, int seatNumber, int price){
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }


    public void bookTicket() {

        if (seatNumber >= 1 && seatNumber <= 30) {
            price = price + 20;  //Price for premium seats
        }
        else if(seatNumber > 30 && seatNumber <= 50){
            this.price = price;
        }
        else {
            price -= 20;   //Price for regular seats
        }

       // System.out.println("Ticket booked successfully!");
    }

    // Method to display ticket details
    public void displayTicketDetails() {
        if (seatNumber > 0) {
            System.out.println("Ticket booked successfully!");
            System.out.println("Movie: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: " + price);
        } else {

            System.out.println("No ticket booked yet.");
        }
    }




    public static void main(String[] args) {
        MovieTicket m = new MovieTicket("Pushpa",45,100);
        MovieTicket m2 = new MovieTicket("Avengers",7,100);

        m.bookTicket();
        m.displayTicketDetails();
        System.out.println();

        m2.bookTicket();
        m2.displayTicketDetails();
    }
}
