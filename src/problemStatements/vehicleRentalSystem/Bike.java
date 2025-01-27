package problemStatements.vehicleRentalSystem;

public class Bike extends Vehicle{

    public Bike(String vehicleNumber, String vehicleType, int rentalRate){
        super(vehicleNumber, vehicleType,rentalRate);
    }

    public int calculateRentalCost(int days){
        return getRentalRate() * days;
    }

    public double insuranceRate(){
        return calculateRentalCost(5) * 0.10;
    }

}
