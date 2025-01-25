package Multilevel_Inheritance.onlineretailOrderManagement;

public class ShippedOrder extends Order {

    protected String trackingNumber;

    // Constructor for ShippedOrder, calls the Order constructor
    public ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);  // Calls the base class constructor
        this.trackingNumber = trackingNumber;
    }

    // Overridden method to get the order status
    @Override
    public String getOrderStatus() {
        return super.getOrderStatus() + "\nOrder has been shipped. Tracking Number: " + trackingNumber;
    }
}
