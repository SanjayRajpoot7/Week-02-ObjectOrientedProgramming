public class Product {

    static int discount = 7;
    final int productID = 1143;

    String productName;
    int price;
    int quantity;

    int totalDiscount;
    int afterDiscountPay;
    int totalPayAmount;

    Product(String productName, int price, int quantity){
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;

        totalDiscount =  (discount * price) / 100;
        afterDiscountPay = price - totalDiscount;
        totalPayAmount = afterDiscountPay * quantity;
    }

//    int totalDiscount;
//    int afterDiscountPay;
//     public void calculations(int price){
//         totalDiscount =  (discount * price) / 100;
//         afterDiscountPay = price - totalDiscount;
//         System.out.println(totalDiscount);
//         System.out.println(afterDiscountPay);
//     }


    public static void updateDiscount(){
        Product product = new Product("Mobile",65900,38);
        System.out.println("Total discount: "+product.totalDiscount);
    }

    public void displayDetails(){
        if (this instanceof Product) {
            System.out.println("bankAccount is an instance of product class");
        } else {
            System.out.println("bankAccount is not instance of product class");
        }

        System.out.println("Product name is: "+productName);
        System.out.println("Product ID: "+productID);
        System.out.println("Price: "+price);
        System.out.println("Price after discount: "+afterDiscountPay);
        System.out.println("Quantity: "+quantity);
        System.out.println("Total amount "+totalPayAmount+" have to pay for "+quantity+" quantity ");

    }

    public static void main(String[] args) {
        Product product = new Product("Mobile",6500,32);
        Product product2 = new Product("Tablet",12500,3);

        product.displayDetails();
        Product.updateDiscount();

        System.out.println();

        product2.displayDetails();
        Product.updateDiscount();

    }
}