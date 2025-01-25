package AssistedProblems.employeeManagementSystem;

public class Developer extends Employee {
    private String programmingLanguage;

    // Constructor to initialize Developer attributes
    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);  // Call the constructor of the Employee class
        this.programmingLanguage = programmingLanguage;
    }

    // Overriding the displayDetails method for Developer
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }

}
