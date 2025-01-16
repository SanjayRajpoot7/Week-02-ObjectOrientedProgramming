public class employeesDetails {
//    String name;
//    int id;
//    double salary;

    public void detailOfEmployee(String name, int id, double salary){
        System.out.println("Employee name is: "+name+"\nId is: "+id+"\nAnd salary is: "+salary);
    }
    public static void main(String[] args) {
    employeesDetails ed = new employeesDetails();
    ed.detailOfEmployee("Raj",2021143, 76210);
    }
}
