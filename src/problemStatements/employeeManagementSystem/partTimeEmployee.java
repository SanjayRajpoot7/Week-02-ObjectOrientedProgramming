package problemStatements.employeeManagementSystem;

public class partTimeEmployee extends Employee implements Department {
    private int hours;
    private int hourlyRate;

    private String departmentName;

    partTimeEmployee(int employeeId, String name, double baseSalary, int hours, int hourlyRate) {
        super(employeeId, name, baseSalary);
//        this.partTimeSalary = partTimeSalary;
        this.hours = hours;
        this.hourlyRate = hourlyRate;
    }

    public double calculateSalary(){
        return getBaseSalary() + (hours * hourlyRate);
    }

    public String assignDepartment(String departmentName) {
        return this.departmentName = departmentName;
    }

    public String getDepartmentDetails() {
        return departmentName;
    }
}

