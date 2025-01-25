package Multilevel_Inheritance.onlineretailOrderManagement;

public class Order {
    protected int orderId;
    protected String orderDate;

    // Constructor for the base class Order
    public Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Method to get Order status
    public String getOrderStatus() {
        return "Order placed on: " + orderDate;
    }

}
