package problemStatements.rideHailingApplication;

public class Car extends Vehicle {
        public Car(String vehicleId, String driverName, double ratePerKm) {
            super(vehicleId, driverName, ratePerKm);
        }

        @Override
        public double calculateFare(double distance) {
            // Calculate fare for car: rate per km * distance
            return getRatePerKm() * distance;
        }

}
