public class Employee {

    static String companyName;
    final int id;

    String destintation;
    static int totalEmployees;

    Employee(String companyName, int id, String destination){
        this.companyName = companyName;
        this.id = id;
        this.destintation = destination;
        totalEmployees++;
    }


    public static void displayTotalEmployees(){
        System.out.println("Total employee: "+totalEmployees);
    }

    public void displayDetails(){
        if (this instanceof Employee) {
            System.out.println("bankAccount is an instance of employee class");
        } else {
            System.out.println("bankAccount is not instance of employee class");
        }

        System.out.println("Company name is: "+companyName+" \nId: "+id+" \nDestination: "+destintation);
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Capgemini",91143,"SDE2");
        Employee employee2 = new Employee("Capgemini",91143,"SDE2");

        employee.displayDetails();
        employee.displayTotalEmployees();
        System.out.println();

        employee2.displayDetails();
        employee2.displayTotalEmployees();
    }
}
