import java.util.ArrayList;
import java.util.List;

// Course class representing a course in the school
class Course2 {
    private String courseName;
    private List<Studentt> students;

    public Course2(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<Studentt>();
    }

    // Method to add a student to a course
    public void addStudent(Studentt student) {
        students.add(student);
    }

    // Method to display students enrolled in the course
    public void displayEnrolledStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Studentt student : students) {
            System.out.println("- " + student.getName());
        }
    }

    public String getCourseName() {
        return courseName;
    }
}

// Student class representing a student who can enroll in multiple courses
class Studentt {
    private String name;
    private List<Course2> courses;

    public Studentt(String name) {
        this.name = name;
        this.courses = new ArrayList<Course2>();
    }

    // Method to enroll in a course
    public void enrollInCourse(Course2 course2) {
        courses.add(course2);
        course2.addStudent(this); // Add the student to the course as well
    }

    // Method to display courses a student is enrolled in
    public void displayEnrolledCourses() {
        System.out.println(name + " is enrolled in the following courses:");
        for (Course2 course : courses) {
            System.out.println("- " + course.getCourseName());
        }
    }

    public String getName() {
        return name;
    }
}

// School class that contains multiple students
class School {
    private String schoolName;
    private List<Studentt> students;

    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<Studentt>();
    }

    // Method to add a student to the school
    public void addStudent(Studentt student) {
        students.add(student);
    }

    // Method to display all students in the school
    public void displayStudents() {
        System.out.println("Students in " + schoolName + ":");
        for (Studentt student : students) {
            System.out.println("- " + student.getName());
        }
    }
}

// Main class to simulate the system
public class SchoolManagementSystem {

    public static void main(String[] args) {
        // Creating courses
        Course2 math = new Course2("Math");
        Course2 science = new Course2("Science");
        Course2 history = new Course2("History");

        // Creating students
        Studentt student1 = new Studentt("John Doe");
        Studentt student2 = new Studentt("Jane Smith");
        Studentt student3 = new Studentt("Mark Johnson");

        // Enrolling students in courses
        student1.enrollInCourse(math);
        student1.enrollInCourse(science);

        student2.enrollInCourse(science);
        student2.enrollInCourse(history);

        student3.enrollInCourse(math);
        student3.enrollInCourse(history);

        // Creating a school and adding students to it
        School school = new School("ABC High School");
        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);

        // Display students and their courses
        school.displayStudents();
        student1.displayEnrolledCourses();
        System.out.println();
        student2.displayEnrolledCourses();
        System.out.println();
        student3.displayEnrolledCourses();

        // Display courses and their students
        System.out.println();
        math.displayEnrolledStudents();
        System.out.println();
        science.displayEnrolledStudents();
        System.out.println();
        history.displayEnrolledStudents();
    }
}
