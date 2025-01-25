package Hybrid_Inheritance.restaurantManagementSystem;

public class Waiter extends Person implements  Worker{
    private String section;

    // Constructor to initialize name, id, and section
    public Waiter(String name, int id, String section) {
        super(name, id);
        this.section = section;
    }

    // Implement the performDuties method from Worker interface
    public void performDuties() {
        System.out.println(name + " is serving customers in the " + section + " section.");
    }

    // Additional method for Waiter
    public void takeOrder() {
        System.out.println(name + " is taking a customer's order.");
    }

}
