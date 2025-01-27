package problemStatements.employeeManagementSystem;

public class fullTimeEmployee extends Employee implements Department{
    int bonus;
    private String departmentName;

    fullTimeEmployee(int employeeId, String name, double baseSalary, int bonus) {
        super(employeeId, name, baseSalary);
        this.bonus = bonus;
    }

    public double calculateSalary() {
            return getBaseSalary() + bonus;
    }

    public String assignDepartment(String departmentName){
        return this.departmentName = departmentName;
    }

    public String getDepartmentDetails() {
        return departmentName;
    }

}
