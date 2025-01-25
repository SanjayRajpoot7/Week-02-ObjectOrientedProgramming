package Hybrid_Inheritance.restaurantManagementSystem;

public class Main {
    public static void main(String[] args) {
        // Create Chef and Waiter instances
        Chef chef = new Chef("Gordon Ramsay", 101, "Taste in hand");
        Waiter waiter = new Waiter("John Doe", 102, "Main Dining");

        // Display personal details and duties
        chef.displayDetails();
        chef.performDuties();
        chef.cook();

        System.out.println();

        waiter.displayDetails();
        waiter.performDuties();
        waiter.takeOrder();
    }
}
