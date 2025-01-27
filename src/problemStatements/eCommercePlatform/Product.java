package problemStatements.eCommercePlatform;

abstract public class Product implements Taxable {
    private int productId;
    private String name;
    private double price;

    Product(int productId, String name, int price){
        this.productId = productId;
        this.name = name;
        this.price = price;
    }
    public abstract double calculateDiscount();

    public double getPrice(){
        return price;
    }

    public String getName(){
        return name;
    }

    public double calculateFinalPrice(){
        return getPrice() + calculateTax() -calculateDiscount();
    }

    public void displayDetails(){
        System.out.println("Product Id: "+productId+"\nProduct name: "+name+"\nPrice: "+price);
        System.out.println("Calculated discount: "+calculateDiscount());
        System.out.println("Final Price after discount: "+calculateFinalPrice());
    }
}
