package Multilevel_Inheritance.educationalCourseHierarchy;

public class OnlineCourse extends Course {
    protected String platform;  // Platform on which the course is offered
    protected boolean isRecorded;  // Whether the course is pre-recorded

    // Constructor for OnlineCourse, calls the Course constructor
    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);  // Calls the constructor of the base class
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    // Overridden method to display online course details
    @Override
    public void displayCourseDetails() {
        super.displayCourseDetails();  // Calls the base class method
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}
