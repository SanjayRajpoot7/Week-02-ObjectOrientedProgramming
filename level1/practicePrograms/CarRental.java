public class CarRental {


    String customerName;
    String carModel;
    int rentalDays;


    public CarRental(String customerName, String carModel, int rentalDays){
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }
    double costOfRentDays;
    public double totalCost(){
        if(carModel.equalsIgnoreCase("Luxury")){
            costOfRentDays = rentalDays * 1050;
        }
        else if(carModel.equalsIgnoreCase("Sports")) {
            costOfRentDays = rentalDays * 750;
        }
        else{
            costOfRentDays = rentalDays * 350;
        }
        return costOfRentDays;
    }


    public void display(){
        System.out.println("Customer name is: "+customerName+" \nCar model: "+carModel+" \nRental days "+rentalDays);
        System.out.println("Total cost have to pay: "+costOfRentDays);
    }


    public static void main(String[] args) {
        CarRental rentalCar = new CarRental("Lucky","Luxury",15);
        CarRental rentalCar1 = new CarRental("Varun","Sports",5);


        rentalCar.totalCost();
        rentalCar.display();

        System.out.println();


        rentalCar1.totalCost();
        rentalCar1.display();
    }
}
