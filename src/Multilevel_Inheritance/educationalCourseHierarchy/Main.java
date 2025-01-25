package Multilevel_Inheritance.educationalCourseHierarchy;

public class Main {
    public static void main(String[] args) {
        // Create a basic course
        Course basicCourse = new Course("Java Programming", 40);

        // Create an online course
        OnlineCourse onlineCourse = new OnlineCourse("Python Programming", 50, "Udemy", true);

        // Create a paid online course
        PaidOnlineCourse paidOnlineCourse = new PaidOnlineCourse("Data Science", 60, "Coursera", true, 200, 10);

        // Display details of each course
        System.out.println("Basic Course Details:");
        basicCourse.displayCourseDetails();

        System.out.println("\nOnline Course Details:");
        onlineCourse.displayCourseDetails();

        System.out.println("\nPaid Online Course Details:");
        paidOnlineCourse.displayCourseDetails();
    }
}
