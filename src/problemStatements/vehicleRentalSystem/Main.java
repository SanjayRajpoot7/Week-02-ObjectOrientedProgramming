package problemStatements.vehicleRentalSystem;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("MP6573","Car",500,"JAI758483");
        Vehicle bike = new Bike("HP8432","Bike",200);
        Vehicle truck = new Truck("MP6573","Car",500,"SHRI758483");

        Vehicle[] vehicles = {car, bike, truck};

        for(Vehicle vehicle: vehicles){
            vehicle.displayDetails();
            if (vehicle instanceof Insurable) {
                System.out.println(((Insurable) vehicle).getInsuranceDetails());
            }
            System.out.println();
        }
    }
}
