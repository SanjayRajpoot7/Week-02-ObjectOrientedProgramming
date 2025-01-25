package Hierarchical_Inheritance.schoolSystem;

public class Teacher extends Person {
    private String subject;

    // Constructor to initialize name, age, and subject
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    // Override the displayRole method to show specific role of Teacher
    @Override
    public void displayRole() {
        System.out.println(name + " is a Teacher, teaching " + subject);
    }

    // Additional method for Teacher
    public void teach() {
        System.out.println(name + " is teaching " + subject + ".");
    }

}
