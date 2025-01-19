public class HotelBooking {


    String guestName;
    private String roomType;
    private int nights;


    public HotelBooking(){
        this.guestName = "Unknown";
        this.roomType = "Standard";
        this.nights = 1;
    }


    public HotelBooking(String guestName, String roomType, int nights){
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }


    public HotelBooking(HotelBooking otherHotelBooking){
        this.guestName = otherHotelBooking.guestName;
        this.roomType = (otherHotelBooking.roomType.equalsIgnoreCase( ("Deluxe")) ? "Suite" : otherHotelBooking.getRoomType());
        this.nights = otherHotelBooking.nights+4;


    }


    public void display(){
        System.out.println("Guest name is: "+guestName+" \tRoom type: "+
                roomType+" \tNights: "+nights);
    }


    public String getRoomType(){
        return roomType;
    }


    public int getNights(){
        return nights;
    }




    public static void main(String[] args) {
        HotelBooking hotelBooking = new HotelBooking();
        HotelBooking hotelBooking2 = new HotelBooking("Raju","Deluxe",3);
        HotelBooking hotelBooking3 = new HotelBooking(hotelBooking2);


        hotelBooking.display();
        hotelBooking2.display();
        hotelBooking3.display();


    }
}
