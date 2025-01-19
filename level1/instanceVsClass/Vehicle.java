class Vehicle {
    // Instance variables
    String ownerName;
    String vehicleType;


    // Class variable (shared by all vehicles)
    static double registrationFee = 200.0;  // Default registration fee for all vehicles


    // Constructor to initialize owner name and vehicle type
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }


    // Instance method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: $" + registrationFee);
    }


    // Class method (static) to update the registration fee for all vehicles
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Updated Registration Fee: $" + registrationFee);
    }






    public static void main(String[] args) {
        // Create Vehicle objects
        Vehicle vehicle1 = new Vehicle("Raju", "Car");
        Vehicle vehicle2 = new Vehicle("Kishan", "Bike");


        // Display vehicle details for both vehicles
        System.out.println("Vehicle 1 Details:");
        vehicle1.displayVehicleDetails();
        System.out.println();


        System.out.println("Vehicle 2 Details:");
        vehicle2.displayVehicleDetails();
        System.out.println();


        // Update the registration fee for all vehicles
        Vehicle.updateRegistrationFee(250.0);


        // Display vehicle details after updating registration fee
        System.out.println("After Updating Registration Fee:");


        System.out.println("Vehicle 1 Details:");
        vehicle1.displayVehicleDetails();
        System.out.println();


        System.out.println("Vehicle 2 Details:");
        vehicle2.displayVehicleDetails();
    }
}
