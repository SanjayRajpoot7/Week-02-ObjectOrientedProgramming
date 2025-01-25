package vehicleAndTransportSystem;

public class MotorCycle extends Vehicle  {

        private boolean hasSidecar;

        // Constructor
        public MotorCycle(int maxSpeed, String fuelType, boolean hasSidecar) {
            super(maxSpeed, fuelType);
            this.hasSidecar = hasSidecar;
        }

        // Overridden method to display motorcycle information
        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Has Sidecar: " + (hasSidecar ? "Yes" : "No"));
        }
}
