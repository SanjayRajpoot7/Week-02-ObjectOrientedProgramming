package Hybrid_Inheritance.vehicleManagementSystem;

public class ElectricVehicle extends Vehicle{
    private int batteryCapacity;

    // Constructor to initialize model, maxSpeed, and batteryCapacity
    public ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed);  // Calling the superclass constructor
        this.batteryCapacity = batteryCapacity;
    }

    // Method to charge the electric vehicle
    public void charge() {
        System.out.println("Charging " + model + " with a battery capacity of " + batteryCapacity + " kWh.");
    }
}
