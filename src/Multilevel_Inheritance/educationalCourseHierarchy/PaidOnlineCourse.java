package Multilevel_Inheritance.educationalCourseHierarchy;

public class PaidOnlineCourse extends OnlineCourse {
    private double fee;  // Fee for the course
    private double discount;  // Discount on the course fee

    // Constructor for PaidOnlineCourse, calls the OnlineCourse constructor
    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);  // Calls the constructor of OnlineCourse
        this.fee = fee;
        this.discount = discount;
    }

    // Overridden method to display paid online course details
    @Override
    public void displayCourseDetails() {
        super.displayCourseDetails();  // Calls the method from OnlineCourse
        System.out.println("Course Fee: $" + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Fee: $" + calculateFinalFee());
    }

    // Method to calculate the final fee after applying the discount
    public double calculateFinalFee() {
        return fee - (fee * (discount / 100));
    }

}

