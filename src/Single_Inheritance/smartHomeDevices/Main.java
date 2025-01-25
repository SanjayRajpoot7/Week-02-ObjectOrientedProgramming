package Single_Inheritance.smartHomeDevices;

public class Main {
    public static void main(String[] args) {
        // Create a Thermostat object
        Thermostat thermostat1 = new Thermostat("T-001", true, 22.5);

        // Display the status of the thermostat
        thermostat1.displayStatus();
    }
}
