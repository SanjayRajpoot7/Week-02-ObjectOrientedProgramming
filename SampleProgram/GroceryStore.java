import java.util.ArrayList;
import java.util.List;

// Product class representing an individual product
class Product {
    private String productName;
    private double pricePerUnit;
    private double quantity;

    // Constructor to initialize product details
    public Product(String productName, double pricePerUnit, double quantity) {
        this.productName = productName;
        this.pricePerUnit = pricePerUnit;
        this.quantity = quantity;
    }

    // Getter methods
    public String getProductName() {
        return productName;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public double getQuantity() {
        return quantity;
    }

    // Method to calculate the total price for the product
    public double calculatePrice() {
        return pricePerUnit * quantity;
    }
}

// Customer class representing the customer
class Customer {
    private String name;
    private List<Product> products;

    // Constructor to initialize customer details
    public Customer(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    // Method to add a product to the customer's cart
    public void addProduct(Product product) {
        products.add(product);
    }

    // Getter method for the customer's name
    public String getName() {
        return name;
    }

    // Getter method for the list of products
    public List<Product> getProducts() {
        return products;
    }
}

// BillGenerator class responsible for calculating the total bill
class BillGenerator {
    // Method to calculate the total bill for a customer
    public double generateBill(Customer customer) {
        double totalBill = 0;
        System.out.println("Bill for Customer: " + customer.getName());
        System.out.println("=======================================");
        for (Product product : customer.getProducts()) {
            double price = product.calculatePrice();
            System.out.println(product.getProductName() + " - " + product.getQuantity() + " units @ " +
                    product.getPricePerUnit() + " per unit = $" + price);
            totalBill += price;
        }
        System.out.println("=======================================");
        System.out.println("Total Bill: $" + totalBill);
        return totalBill;
    }
}

// Main class to simulate the Grocery Store Bill Generation
public class GroceryStore {
    public static void main(String[] args) {
        // Creating products
        Product apples = new Product("Apples", 3.0, 2);  // 2 kg at $3 per kg
        Product milk = new Product("Milk", 2.0, 1);    // 1 liter at $2 per liter

        // Creating customer
        Customer customer = new Customer("Alice");

        // Adding products to the customer's cart
        customer.addProduct(apples);
        customer.addProduct(milk);

        // Creating BillGenerator and generating the bill
        BillGenerator billGenerator = new BillGenerator();
        billGenerator.generateBill(customer);  // Displaying the bill
    }
}
