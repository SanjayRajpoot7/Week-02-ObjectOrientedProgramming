package problemStatements.eCommercePlatform;

public class Electronics extends Product implements Taxable{
      private double discountPercentage;

    Electronics(int productId, String name, int price,int discountPercentage){
        super(productId,name,price);
        this.discountPercentage =  discountPercentage;
    }

    public double calculateDiscount(){
        return (getPrice() * discountPercentage / 100);
    }

    public double calculateTax(){
        return getPrice() * 0.18;
    }

    public String getTaxDetails(){
        return "Electronics item tax rate is 18%.";
    }

}
