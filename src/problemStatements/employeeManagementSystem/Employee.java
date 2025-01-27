package problemStatements.employeeManagementSystem;

abstract public class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    public abstract double calculateSalary();

    Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public void displayDetails() {
        System.out.println("Employee Id: " + employeeId + "\nName: " + name +
                "\nBase salary: " + baseSalary);
        System.out.println("Calculated salary: "+calculateSalary());
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public String getName(){
        return name;
    }
}
