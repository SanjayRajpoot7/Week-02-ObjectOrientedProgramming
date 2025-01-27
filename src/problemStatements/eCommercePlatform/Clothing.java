package problemStatements.eCommercePlatform;

public class Clothing extends Product {
    private double discountPercentage;

    Clothing(int productId, String name, int price, double discountPercentage){
        super(productId, name, price);
        this.discountPercentage = discountPercentage;
    }

    public double calculateDiscount(){
        return (getPrice() * discountPercentage / 100);
    }

    public double calculateTax(){
        return 0;
    }

    public String getTaxDetails(){
        return "Clothing is not taxable.";
    }

}
