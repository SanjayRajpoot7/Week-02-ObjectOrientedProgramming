package Hybrid_Inheritance.vehicleManagementSystem;

public class Vehicle {
    protected String model;
    protected int maxSpeed;

    // Constructor to initialize model and maxSpeed
    public Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}
