package vehicleAndTransportSystem;

public class Truck extends Vehicle{

        private double cargoCapacity;

        // Constructor
        public Truck(int maxSpeed, String fuelType, double cargoCapacity) {
            super(maxSpeed, fuelType);
            this.cargoCapacity = cargoCapacity;
        }

        // Overridden method to display truck information
        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Cargo Capacity: " + cargoCapacity + " tons");
        }

}
