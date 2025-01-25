package Multilevel_Inheritance.onlineretailOrderManagement;

public class Main {
    public static void main(String[] args) {
        // Create an order, shipped order, and delivered order
        Order order = new Order(1001, "2025-01-01");
        ShippedOrder shippedOrder = new ShippedOrder(1002, "2025-01-02", "TRK123456");
        DeliveredOrder deliveredOrder = new DeliveredOrder(1003, "2025-01-03", "TRK654321", "2025-01-05");

        // Print the status of each order
        System.out.println("Order Status for Order ID 1001:");
        System.out.println(order.getOrderStatus());

        System.out.println("\nOrder Status for Order ID 1002:");
        System.out.println(shippedOrder.getOrderStatus());

        System.out.println("\nOrder Status for Order ID 1003:");
        System.out.println(deliveredOrder.getOrderStatus());
    }
}
