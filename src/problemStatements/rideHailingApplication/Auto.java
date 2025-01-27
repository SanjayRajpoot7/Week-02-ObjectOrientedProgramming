package problemStatements.rideHailingApplication;

public class Auto extends Vehicle {
    public Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        // Calculate fare for auto: rate per km * distance
        return getRatePerKm() * distance;
    }
}
