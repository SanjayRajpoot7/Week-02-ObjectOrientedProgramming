package problemStatements.eCommercePlatform;

public class Groceries extends Product implements Taxable{
    private double discountPercentage;

    Groceries(int productId, String name, int price, double discountPercentage){
        super(productId, name, price);
        this.discountPercentage = discountPercentage;
    }

    public double calculateDiscount(){
        return (getPrice() * discountPercentage / 100);
    }

    public double calculateTax(){
        return getPrice() * 0.05;
    }
    public String getTaxDetails(){
        return "Groceries items tax rate is 5%.";
    }
}
