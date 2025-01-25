package AssistedProblems.employeeManagementSystem;

public class Manager extends Employee {
    private int teamSize;

    // Constructor to initialize Manager attributes
    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);  // Call the constructor of the Employee class
        this.teamSize = teamSize;
    }

    // Overriding the displayDetails method for Manager
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }

}
