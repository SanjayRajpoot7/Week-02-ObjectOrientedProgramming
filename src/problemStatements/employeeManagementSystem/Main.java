package problemStatements.employeeManagementSystem;

public class Main {

    public static void main(String[] args) {
        Employee fTE = new fullTimeEmployee(187, "Rohit", 50000, 5000);
        Employee pTE = new partTimeEmployee(143, "Amul", 20000, 20, 50);

        ((fullTimeEmployee) fTE).assignDepartment("Finance");
        ((partTimeEmployee) pTE).assignDepartment("Business");

//        ((fullTimeEmployee) fTE).getDepartmentDetails();
//        fTE.displayDetails();
//        System.out.println();
//
//        ((partTimeEmployee) pTE).getDepartmentDetails();
//        pTE.displayDetails();

        Employee[] employees = {fTE, pTE};

        for (Employee employee : employees) {
            if (employee instanceof Department) {
                System.out.println("Department name: "+((Department) employee).getDepartmentDetails());
            }
            employee.displayDetails();
            System.out.println();

        }
    }
}
