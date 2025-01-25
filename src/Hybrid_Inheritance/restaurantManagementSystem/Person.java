package Hybrid_Inheritance.restaurantManagementSystem;

public class Person {
    protected String name;
    protected int id;

    // Constructor to initialize name and id
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Method to display personal details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}
