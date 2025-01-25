package Hybrid_Inheritance.restaurantManagementSystem;

public class Chef extends Person implements Worker{
    private String specialty;

    // Constructor to initialize name, id, and specialty
    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    // Implement the performDuties method from Worker interface
    public void performDuties()
    {
        System.out.println(name + " is preparing " + specialty + " in the kitchen.");
    }

    // Additional method for Chef
    public void cook()
    {
        System.out.println(name + " is cooking a delicious dish.");
    }

}
