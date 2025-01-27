package problemStatements.rideHailingApplication;

public class Main {
    public static void main(String[] args) {
        // Create instances of different vehicles
        Vehicle car = new Car("CAR123", "Karan", 2.5);
        Vehicle bike = new Bike("BIKE456", "Suraj", 5);
        Vehicle auto = new Auto("AUTO789", "Raj", 0.2);

        // Process a list of vehicles and calculate fares dynamically using polymorphism
        Vehicle[] vehicles = {car, bike, auto};

        double totalFare = 0;
        double distance = 10.0;  // Example distance

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getVehicleDetails());
            double fare = vehicle.calculateFare(distance);
            System.out.println("Fare for " + vehicle.getVehicleId() + ": $" + fare);
            totalFare += fare;
            System.out.println();
        }

        // Display total fare for all vehicles
        System.out.println("Total Fare for All Vehicles: $" + totalFare);

    }
}
