package problemStatements.eCommercePlatform;

public class Main{
    public static void main(String[] args) {

        Product electronicProduct = new Electronics(123, "Fan", 1200, 25);
        Product clothingProduct = new Clothing(124, "Shirt", 700, 12);
        Product groceriesProduct = new Groceries(125, "Flour", 1200, 5);

        Product[] products = {electronicProduct, clothingProduct, groceriesProduct};

        for (Product product : products) {
            product.displayDetails();
            if(product instanceof Taxable){
                System.out.println(((Taxable) product).getTaxDetails());
            }
            System.out.println();
        }
    }
}
