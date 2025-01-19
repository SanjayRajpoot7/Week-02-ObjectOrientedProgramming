public class Course {
    String courseName;
    int duration;
    double fee;






    static String instituteName = "Technocrats Institute";


    // Constructor to initialize course details
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }


    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: $" + fee);
        System.out.println("Institute: " + instituteName);  // Shared by all courses
    }


    // Class method (static) to update the institute name for all courses
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }


    public static void main(String[] args) {
        // Create Course objects
        Course course1 = new Course("Java Programming", 6, 500);
        Course course2 = new Course("Data Science", 12, 1000);


        // Display course details for both courses
        System.out.println("Course 1 Details:");
        course1.displayCourseDetails();
        System.out.println();


        System.out.println("Course 2 Details:");
        course2.displayCourseDetails();
        System.out.println();


        // Update institute name for all courses
        Course.updateInstituteName("Orinetal Institute");


        // Display course details after updating institute name
        System.out.println("After updating Institute Name:");
        System.out.println();


        System.out.println("Course 1 Details:");
        course1.displayCourseDetails();
        System.out.println();


        System.out.println("Course 2 Details:");
        course2.displayCourseDetails();
    }
}


