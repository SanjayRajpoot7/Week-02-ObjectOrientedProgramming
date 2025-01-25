package AssistedProblems.employeeManagementSystem;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice", 101, 80000, 5);
        Developer developer = new Developer("Bob", 102, 70000, "Java");
        Intern intern = new Intern("Charlie", 103, 15000, 6);

        // Display details for each employee
        System.out.println("Manager Details:");
        manager.displayDetails();
        System.out.println("\nDeveloper Details:");
        developer.displayDetails();
        System.out.println("\nIntern Details:");
        intern.displayDetails();
    }
}
