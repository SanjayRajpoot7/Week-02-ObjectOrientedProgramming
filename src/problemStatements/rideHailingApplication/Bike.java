package problemStatements.rideHailingApplication;

public class Bike extends Vehicle {
    public Bike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        // Calculate fare for bike: rate per km * distance
        return getRatePerKm() * distance;
    }
}
