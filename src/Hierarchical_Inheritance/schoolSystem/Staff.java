package Hierarchical_Inheritance.schoolSystem;

public class Staff extends  Person{
    private String department;

    // Constructor to initialize name, age, and department
    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    // Override the displayRole method to show specific role of Staff
    @Override
    public void displayRole() {
        System.out.println(name + " is a Staff member in the " + department + " department.");
    }

    // Additional method for Staff
    public void work() {
        System.out.println(name + " is working in the " + department + " department.");
    }

}
