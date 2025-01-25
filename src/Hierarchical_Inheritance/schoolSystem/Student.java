package Hierarchical_Inheritance.schoolSystem;

public class Student extends Person {
    private String grade;

    // Constructor to initialize name, age, and grade
    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    // Override the displayRole method to show specific role of Student
    @Override
    public void displayRole() {
        System.out.println(name + " is a Student, in grade " + grade);
    }

    // Additional method for Student
    public void study() {
        System.out.println(name + " is studying for the " + grade + " grade.");
    }
}
