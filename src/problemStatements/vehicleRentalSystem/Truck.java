package problemStatements.vehicleRentalSystem;

public class Truck extends Vehicle implements Insurable{
    private String insurancePolicyNumber;

    public Truck(String vehicleNumber, String vehicleType, int rentalRate, String insurancePolicyNumber){
        super(vehicleNumber, vehicleType,rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    public int calculateRentalCost(int days){
        return getRentalRate() * days;
    }

    public double calculateInsurance(){
        return calculateRentalCost(1) * 0.20;
    }

    public String getInsuranceDetails(){
        return ("Insurance policy number is: "+insurancePolicyNumber);
    }
}
