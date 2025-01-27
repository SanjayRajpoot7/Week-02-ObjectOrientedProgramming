package problemStatements.vehicleRentalSystem;

public abstract class Vehicle {
    private String vehicleNumber;
    private String vehicleType;
    private int rentalRate;

    public Vehicle(String vehicleNumber, String vehicleType, int rentalRate){
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.rentalRate = rentalRate;
    }

    public abstract int calculateRentalCost(int days);

    public void displayDetails(){
        System.out.println("Vehicle number: "+vehicleNumber+"\nVehicle type: "+
                vehicleType+"\nRental rate: "+rentalRate);
        System.out.println("Calculated rental cost: "+calculateRentalCost(7));

    }

//    public String getVehicleType(){
//        return vehicleType;
//    }

    public int getRentalRate(){
        return rentalRate;
    }


}
