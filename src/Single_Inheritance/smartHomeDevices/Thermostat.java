package Single_Inheritance.smartHomeDevices;

class Thermostat extends Device {
    private double temperatureSetting;

    // Constructor
    public Thermostat(String deviceId, boolean status, double temperatureSetting) {
        super(deviceId, status); // Call the superclass constructor
        this.temperatureSetting = temperatureSetting;
    }

    // Overridden method to display thermostat status
    @Override
    public void displayStatus() {
        super.displayStatus(); // Call the superclass method
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}
