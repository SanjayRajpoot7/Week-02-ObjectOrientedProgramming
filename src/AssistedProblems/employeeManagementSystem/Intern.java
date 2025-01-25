package AssistedProblems.employeeManagementSystem;

public class Intern extends Employee {
    private int internshipDuration; // Duration in months

    // Constructor to initialize Intern attributes
    public Intern(String name, int id, double salary, int internshipDuration) {
        super(name, id, salary);  // Call the constructor of the Employee class
        this.internshipDuration = internshipDuration;
    }

    // Overriding the displayDetails method for Intern
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Internship Duration: " + internshipDuration + " months");
    }

}
