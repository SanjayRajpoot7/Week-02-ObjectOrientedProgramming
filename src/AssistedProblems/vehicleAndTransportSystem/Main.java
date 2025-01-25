package vehicleAndTransportSystem;

 public class Main {
     public static void main(String[] args) {
         // Creating objects of different vehicle types
         Vehicle car = new Car(180, "Petrol", 5);
         Vehicle truck = new Truck(120, "Diesel", 10.5);
         Vehicle motorcycle = new MotorCycle(150, "Petrol", true);

         // Displaying info using polymorphism
         Vehicle[] vehicles = {car, truck, motorcycle};
         for (Vehicle vehicle : vehicles) {
             System.out.println("\nVehicle Info:");
             vehicle.displayInfo();
             System.out.println("-------------------");
         }
     }

 }
