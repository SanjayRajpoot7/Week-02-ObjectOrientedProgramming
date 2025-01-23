import java.util.ArrayList;
import java.util.List;

// Product class representing individual products
class Product {
    private String productName;
    private double price;
    private String description;

    // Constructor
    public Product(String productName, double price, String description) {
        this.productName = productName;
        this.price = price;
        this.description = description;
    }

    // Getter methods
    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    // Display product details
    public void displayProductDetails() {
        System.out.println("Product: " + productName + " | Price: $" + price + " | Description: " + description);
    }
}

// Order class representing an order placed by a customer
class Order {
    private static int orderCounter = 1;  // Static counter for generating unique order IDs
    private int orderId;
    private Customer customer;
    private List<Product> products; // Aggregation: Order contains multiple products

    // Constructor
    public Order(Customer customer) {
        this.orderId = orderCounter++;
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    // Method to add a product to the order
    public void addProduct(Product product) {
        products.add(product);
    }

    // Method to display order details
    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId + " | Customer: " + customer.getCustomerName());
        System.out.println("Products in this order:");
        for (Product product : products) {
            product.displayProductDetails();
        }
    }

    // Calculate the total price of the order
    public double calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    // Get order ID for external use
    public int getOrderId() {
        return orderId;
    }
}

// Customer class representing an individual customer
class Customer {
    private String customerName;
    private String email;
    private List<Order> orders; // Association: Customer can have many Orders

    // Constructor
    public Customer(String customerName, String email) {
        this.customerName = customerName;
        this.email = email;
        this.orders = new ArrayList<>();
    }

    // Getter methods
    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    // Method to place an order
    public Order placeOrder() {
        Order order = new Order(this); // Create a new order for this customer
        orders.add(order);
        return order;  // Return the created order so products can be added
    }

    // Display customer details and their orders
    public void displayCustomerDetails() {
        System.out.println("Customer: " + customerName + " | Email: " + email);
        if (orders.isEmpty()) {
            System.out.println("  No orders placed yet.");
        } else {
            for (Order order : orders) {
                order.displayOrderDetails();
                System.out.println("  Total: $" + order.calculateTotal());
            }
        }
    }

    public static void main(String[] args) {
        // Create some products
        Product product1 = new Product("Laptop", 999.99, "High-end laptop with 16GB RAM");
        Product product2 = new Product("Smartphone", 499.99, "Smartphone with 64GB storage");
        Product product3 = new Product("Headphones", 79.99, "Wireless over-ear headphones");

        // Create a customer
        Customer customer1 = new Customer("John Doe", "john.doe@example.com");

        // Customer places an order
        Order order1 = customer1.placeOrder();
        order1.addProduct(product1);
        order1.addProduct(product2);

        // Customer places another order
        Order order2 = customer1.placeOrder();
        order2.addProduct(product3);

        // Display customer details and orders
        customer1.displayCustomerDetails();
    }
}
