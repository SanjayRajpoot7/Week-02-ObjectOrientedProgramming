package problemStatements.rideHailingApplication;

public abstract class Vehicle{
        private String vehicleId;
        private String driverName;
        private double ratePerKm;

        // Constructor to initialize vehicle details
        public Vehicle(String vehicleId, String driverName, double ratePerKm) {
            this.vehicleId = vehicleId;
            this.driverName = driverName;
            this.ratePerKm = ratePerKm;
        }

        // Abstract method to calculate fare (to be implemented by subclasses)
        public abstract double calculateFare(double distance);

        // Concrete method to return vehicle details
        public String getVehicleDetails() {
            return "Vehicle ID: " + vehicleId + "\nDriver Name: " + driverName + "\nRate per Km: $" + ratePerKm;
        }

        // Getter methods
        public String getVehicleId() {
            return vehicleId;
        }

        public String getDriverName() {
            return driverName;
        }

        public double getRatePerKm() {
            return ratePerKm;
        }
}
