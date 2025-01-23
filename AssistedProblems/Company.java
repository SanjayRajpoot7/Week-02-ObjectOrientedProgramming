import java.util.ArrayList;

class Company {
    private String companyName;
    private ArrayList<Department> departments;  // The company has departments (composition)

    // Constructor to initialize the company
    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    // Method to add a department to the company
    public void addDepartment(Department department) {
        departments.add(department);
    }

    // Method to display the company's departments and their employees
    public void displayCompanyDetails() {
        System.out.println("Company: " + companyName);
        for (Department department : departments) {
            department.displayDepartmentDetails();
        }
    }

    // When the company is deleted, all departments and employees will be deleted automatically
    public void deleteCompany() {
        departments.clear(); // Removes all departments and their associated employees
        System.out.println("All departments and employees are deleted as the company is removed.");
    }
}

class Department {
    private String departmentName;
    private ArrayList<Employee> employees;  // Each department has employees (composition)

    // Constructor to initialize the department
    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.employees = new ArrayList<>();
    }

    // Method to add an employee to the department
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Method to display department details and employees
    public void displayDepartmentDetails() {
        System.out.println("  Department: " + departmentName);
        for (Employee employee : employees) {
            employee.displayEmployeeDetails();
        }
    }

    // When the department is deleted, all employees will be deleted automatically
    public void deleteDepartment() {
        employees.clear(); // Removes all employees in this department
        System.out.println("  All employees are deleted as the department is removed.");
    }
}

class Employee {
    private String name;
    private String position;

    // Constructor to initialize the employee
    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("    Employee: " + name + ", Position: " + position);
    }

    public static void main(String[] args) {
        // Create a Company
        Company company = new Company("TechCorp");

        // Create Departments for the company
        Department department1 = new Department("IT");
        Department department2 = new Department("HR");

        // Create Employees for each department
        Employee emp1 = new Employee("Alice", "Developer");
        Employee emp2 = new Employee("Bob", "Tester");
        Employee emp3 = new Employee("Charlie", "HR Manager");

        // Add Employees to Departments
        department1.addEmployee(emp1);
        department1.addEmployee(emp2);
        department2.addEmployee(emp3);

        // Add Departments to the Company
        company.addDepartment(department1);
        company.addDepartment(department2);

        // Display the company's details
        company.displayCompanyDetails();

        // Delete the company (which should also delete the departments and employees)
        company.deleteCompany();
    }
}
