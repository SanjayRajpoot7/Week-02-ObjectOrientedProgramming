package Hybrid_Inheritance.vehicleManagementSystem;

public class PetrolVehicle extends Vehicle implements Refuelable {
    private double fuelCapacity;

    // Constructor to initialize model, maxSpeed, and fuelCapacity
    public PetrolVehicle(String model, int maxSpeed, double fuelCapacity) {
        super(model, maxSpeed);  // Calling the superclass constructor
        this.fuelCapacity = fuelCapacity;
    }

    // Implement refuel method from Refuelable interface

    public void refuel() {
        System.out.println("Refueling " + model + " with fuel capacity of " + fuelCapacity + " liters.");
    }

}
