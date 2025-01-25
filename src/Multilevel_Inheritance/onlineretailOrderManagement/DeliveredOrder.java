package Multilevel_Inheritance.onlineretailOrderManagement;

public class DeliveredOrder extends ShippedOrder {

    private String deliveryDate;

    // Constructor for DeliveredOrder, calls the ShippedOrder constructor
    public DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);  // Calls the subclass constructor
        this.deliveryDate = deliveryDate;
    }

    // Overridden method to get the order status
    @Override
    public String getOrderStatus() {
        return super.getOrderStatus() + "\nOrder has been delivered on: " + deliveryDate;
    }

}
