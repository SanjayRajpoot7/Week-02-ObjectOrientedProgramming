package Multilevel_Inheritance.educationalCourseHierarchy;

public class Course {
    protected String courseName;
    protected int duration;  // Duration in hours

    // Constructor for the Course class
    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    // Method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Duration: " + duration + " hours");
    }
}
