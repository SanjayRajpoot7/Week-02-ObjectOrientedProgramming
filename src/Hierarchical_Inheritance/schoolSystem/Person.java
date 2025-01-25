package Hierarchical_Inheritance.schoolSystem;

public class Person {
    protected String name;
    protected int age;

    // Constructor to initialize name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display personal details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Abstract method to display the role
    public void displayRole() {
        System.out.println("This is a general person.");
    }

}
