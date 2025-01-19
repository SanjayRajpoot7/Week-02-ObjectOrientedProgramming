public class Product {


    // These all are instance variable.
    String productName;
    int price;


    // It is class (static) variable.
    int totalProducts;


    static int totalNumberOfProducts;


    public Product(String productName, int price, int totalProducts){
        this.productName = productName;
        this.price = price;
        this.totalProducts = totalProducts;


        totalNumberOfProducts += totalProducts;
    }




    public void displayProductDetails(){
        System.out.println("The product name is: "+productName);
        System.out.println("The product price is: "+price);
    }


    public void displayTotalProducts(){
        double totalPrice = totalProducts * price;
        displayProductDetails();
        System.out.println("Total number of products of this item: "+totalProducts);
        System.out.println("Total cost: "+totalPrice);
        return;
    }


    public static void displayTotalNumberOfProducts()
    {
        System.out.println("Both of category total product: "+totalNumberOfProducts);
    }


    public static void main(String[] args) {
        Product productInventory = new Product("Watch",3500,23);
        Product productInventory2 = new Product("Laptop",67000,7);


        productInventory.displayTotalProducts();
//        productInventory.displayTotalNumberOfProducts();
        System.out.println();
        productInventory2.displayTotalProducts();
        System.out.println();
        displayTotalNumberOfProducts();




    }
}
