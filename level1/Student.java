class Student {
    // Static variable: shared across all instances
    static String universityName = "Global University"; // Shared university name for all students
    static int totalStudents = 0; // Counter to keep track of the total number of students

    // Final variable: Roll number is immutable once assigned
    final int rollNumber;

    // Instance variables: student details
    String name;
    String grade;

    // Constructor to initialize student details and increment totalStudents
    public Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++; // Increment total student count upon each new student
    }

    // Static method to display total number of students enrolled
    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    // Method to update grade (only if the object is an instance of Student class)
    public void updateGrade(String newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
            System.out.println("Grade updated to: " + newGrade);
        } else {
            System.out.println("Error: Not a valid Student object.");
        }
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
        System.out.println("University: " + universityName);
    }

    // Method to check if the object is an instance of the Student class
    public static boolean isInstanceOfStudent(Object obj) {
        return obj instanceof Student;
    }

    public static void main(String[] args) {
        // Create a few students
        Student student1 = new Student(101, "John Doe", "A");
        Student student2 = new Student(102, "Jane Smith", "B");
        Student student3 = new Student(103, "Alice Johnson", "A+");

        // Display total students enrolled
        Student.displayTotalStudents();

        // Display details of each student
        student1.displayStudentDetails();
        student2.displayStudentDetails();
        student3.displayStudentDetails();

        // Update grade of student1
        student1.updateGrade("A+");

        // Check if an object is an instance of the Student class
        if (Student.isInstanceOfStudent(student1)) {
            System.out.println("student1 is an instance of Student.");
        }

        // Attempt to update grade of a non-student object
        String nonStudent = "Not a student";
        if (Student.isInstanceOfStudent(nonStudent)) {
            System.out.println("This is a student.");
        } else {
            System.out.println("This is not a student.");
        }
    }
}
