// Parent class: Employee
class Employee {
    // Public field
    public String employeeID;


    // Protected field
    protected String department;


    // Private field
    private double salary;


    // Constructor
    public Employee(String employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }


    // Public method to modify the salary
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary cannot be negative.");
        }
    }


    // Public method to get the salary
    public double getSalary() {
        return salary;
    }


    // Method to display employee information
    public void displayEmployeeInfo() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + getSalary());
    }
}


// Subclass: Manager
class Manager extends Employee {
    // Constructor
    public Manager(String employeeID, String department, double salary) {
        super(employeeID, department, salary); // Call the constructor of the parent class
    }


    // Method to display Manager information
    public void displayManagerInfo() {
        // Access employeeID and department directly
        System.out.println("Manager Information:");
        System.out.println("Employee ID: " + employeeID); // Public field can be accessed
        System.out.println("Department: " + department); // Protected field can be accessed
        System.out.println("Salary: " + getSalary()); // Accessing private salary via public method
    }


    public static void main(String[] args) {
        // Create an Employee instance
        Employee employee = new Employee("E12345", "HR", 50000.0);
        employee.displayEmployeeInfo();


        System.out.println();


        // Modify salary using setSalary method
        employee.setSalary(55000.0);
        employee.displayEmployeeInfo();


        System.out.println();


        // Create a Manager instance
        Manager manager = new Manager("M98765", "IT", 90000.0);
        manager.displayManagerInfo();
    }
}
