class Vehicle {
    // Static variable: common for all vehicles
    static double registrationFee = 100.0; // Common registration fee for all vehicles

    // Final variable: Registration number is immutable once assigned
    final String registrationNumber;

    // Instance variables: Vehicle details
    String ownerName;
    String vehicleType;

    // Constructor to initialize vehicle details
    public Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Static method to update registration fee
    public static void updateRegistrationFee(double newFee) {
        if (newFee > 0) {
            registrationFee = newFee;
        } else {
            System.out.println("Invalid registration fee. It must be a positive value.");
        }
    }

    // Method to display registration details if the object is an instance of Vehicle
    public void displayRegistrationDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Vehicle Registration Details:");
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: $" + registrationFee);
        } else {
            System.out.println("Error: Object is not an instance of Vehicle.");
        }
    }

    // Static method to check if an object is an instance of Vehicle
    public static boolean isInstanceOfVehicle(Object obj) {
        return obj instanceof Vehicle;
    }

    public static void main(String[] args) {
        // Create a few vehicles
        Vehicle vehicle1 = new Vehicle("V1234", "John Doe", "Car");
        Vehicle vehicle2 = new Vehicle("V5678", "Jane Smith", "Motorcycle");
        Vehicle vehicle3 = new Vehicle("V9012", "Alice Johnson", "Truck");

        // Display registration details of the vehicles
        vehicle1.displayRegistrationDetails();
        System.out.println("-------------------------------");

        Vehicle.updateRegistrationFee(190.0);
        System.out.println("\nUpdated Registration Fee: $" + Vehicle.registrationFee);
        vehicle2.displayRegistrationDetails();
        System.out.println("-------------------------------");
        vehicle3.displayRegistrationDetails();

        // Update the registration fee
        Vehicle.updateRegistrationFee(150.0);
        System.out.println("\nUpdated Registration Fee: $" + Vehicle.registrationFee);

        // Display registration details again after updating the fee
        System.out.println("\nAfter updating the registration fee:");
        vehicle1.displayRegistrationDetails();
        vehicle2.displayRegistrationDetails();
        vehicle3.displayRegistrationDetails();

        // Check if an object is an instance of Vehicle class
        if (Vehicle.isInstanceOfVehicle(vehicle1)) {
            System.out.println("\nvehicle1 is an instance of Vehicle.");
        }

        // Check an object that is not an instance of Vehicle
        String nonVehicle = "Not a vehicle";
        if (Vehicle.isInstanceOfVehicle(nonVehicle)) {
            System.out.println("This is a vehicle.");
        } else {
            System.out.println("This is not a vehicle.");
        }
    }
}
