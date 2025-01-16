package level1;
public class MobilePhone {
    String brand;
    String model;
    double price;

    MobilePhone(String brand, String model, double price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displayDetails(){
        System.out.println("Brand name: "+brand+"\nmodel name: "+model+"\nprice: "+price);
    }
    public static void main(String[] args) {
        MobilePhone m = new MobilePhone("Infinix", "Hot 8", 9999);
        m.displayDetails();
    }
}
