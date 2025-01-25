package Hierarchical_Inheritance.schoolSystem;

public class Main {
    public static void main(String[] args) {
        // Create Teacher, Student, and Staff instances
        Teacher teacher = new Teacher("Mr. Sanju", 40, "Mathematics");
        Student student = new Student("Jay", 16, "10th");
        Staff staff = new Staff("Karun", 35, "Administration");

        // Display details and roles
        teacher.displayDetails();
        teacher.displayRole();
        teacher.teach();

        System.out.println();

        student.displayDetails();
        student.displayRole();
        student.study();

        System.out.println();

        staff.displayDetails();
        staff.displayRole();
        staff.work();
    }
}
