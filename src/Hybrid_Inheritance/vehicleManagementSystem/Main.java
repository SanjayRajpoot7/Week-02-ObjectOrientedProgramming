package Hybrid_Inheritance.vehicleManagementSystem;

public class Main {
    public static void main(String[] args) {
        // Create ElectricVehicle and PetrolVehicle objects
        ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 200, 75);
        PetrolVehicle pv = new PetrolVehicle("Toyota Corolla", 180, 50);

        // Display details and perform actions on ElectricVehicle
        System.out.println("Electric Vehicle Details:");
        ev.displayDetails();
        ev.charge();

        System.out.println();

        // Display details and perform actions on PetrolVehicle
        System.out.println("Petrol Vehicle Details:");
        pv.displayDetails();
        pv.refuel();
    }
}
