import java.util.ArrayList;
import java.util.List;

// Course class representing an individual course
class Course {
    private String courseName;
    private Professor professor;  // Aggregation: A course can have a professor
    private List<Student> students;  // Association: A course can have multiple students
    private int capacity;  // Maximum number of students that can enroll

    // Constructor to initialize the course with name and capacity
    public Course(String courseName, int capacity) {
        this.courseName = courseName;
        this.capacity = capacity;
        this.students = new ArrayList<>();
    }

    // Method to assign a professor to the course
    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    // Method to enroll a student in the course if the course is not full
    public boolean enrollStudent(Student student) {
        if (students.size() < capacity) {
            if (!students.contains(student)) {
                students.add(student);
                System.out.println(student.getName() + " successfully enrolled in " + courseName);
                return true;
            } else {
                System.out.println(student.getName() + " is already enrolled in " + courseName);
                return false;
            }
        } else {
            System.out.println("Course " + courseName + " is full. Enrollment failed.");
            return false;
        }
    }

    // Method to display the course details
    public void displayCourseDetails() {
        System.out.println("Course: " + courseName);
        if (professor != null) {
            System.out.println("Professor: " + professor.getName());
        } else {
            System.out.println("Professor: Not assigned yet");
        }
        System.out.println("Students enrolled:");
        if (students.isEmpty()) {
            System.out.println("  No students enrolled.");
        } else {
            for (Student student : students) {
                System.out.println("  " + student.getName());
            }
        }
    }

    // Getter methods
    public String getCourseName() {
        return courseName;
    }

    public Professor getProfessor() {
        return professor;
    }
}

// Professor class representing a professor
class Professor {
    private String name;
    private String department;

    // Constructor to initialize the professor
    public Professor(String name, String department) {
        this.name = name;
        this.department = department;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    // Method to assign grades to a student for a specific course
    public void assignGrade(Student student, Course course, String grade) {
        student.assignGrade(course, grade);
    }

    // Method to display professor details
    public void displayProfessorDetails() {
        System.out.println("Professor: " + name + " | Department: " + department);
    }
}

// Student class representing a student
class Student {
    private String name;
    private String studentId;
    private List<Course> courses;  // Association: A student can enroll in many courses
    private List<String> grades;  // A list of grades for each course the student is enrolled in

    // Constructor to initialize the student
    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
        this.courses = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    // Method to enroll in a course
    public void enrollCourse(Course course) {
        if (course.enrollStudent(this)) {
            courses.add(course);
            grades.add("Not Graded");  // Initially, students are not graded
        }
    }

    // Method to assign a grade to a student for a specific course
    public void assignGrade(Course course, String grade) {
        int index = courses.indexOf(course);
        if (index != -1) {
            grades.set(index, grade);
            System.out.println("Grade for " + name + " in " + course.getCourseName() + " has been updated to: " + grade);
        } else {
            System.out.println("Student is not enrolled in this course.");
        }
    }

    // Method to display student details and grades
    public void displayStudentDetails() {
        System.out.println("Student: " + name + " | Student ID: " + studentId);
        System.out.println("Enrolled Courses and Grades:");
        if (courses.isEmpty()) {
            System.out.println("  No courses enrolled.");
        } else {
            for (int i = 0; i < courses.size(); i++) {
                System.out.println("  " + courses.get(i).getCourseName() + " | Grade: " + grades.get(i));
            }
        }
    }
}

// University Management System to manage enrollment, grading, and course details
public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Create professors
        Professor professor1 = new Professor("Dr. Smith", "Computer Science");
        Professor professor2 = new Professor("Dr. Johnson", "Mathematics");

        // Create courses with capacity
        Course course1 = new Course("Data Structures", 2);
        Course course2 = new Course("Calculus", 3);

        // Assign professors to courses
        course1.assignProfessor(professor1);
        course2.assignProfessor(professor2);

        // Create students
        Student student1 = new Student("Alice", "S001");
        Student student2 = new Student("Bob", "S002");
        Student student3 = new Student("Charlie", "S003");

        // Students enroll in courses
        student1.enrollCourse(course1);
        student2.enrollCourse(course1);
        student3.enrollCourse(course1);  // Should not be allowed since the course is full

        student1.enrollCourse(course2);
        student2.enrollCourse(course2);

        // Assign grades to students
        professor1.assignGrade(student1, course1, "A");
        professor1.assignGrade(student2, course1, "B");
        professor2.assignGrade(student1, course2, "B+");

        // Display details of students, courses, and professors
        student1.displayStudentDetails();
        student2.displayStudentDetails();
        student3.displayStudentDetails();  // Should show no enrolled courses due to course full

        System.out.println("\nCourses and Professors:");
        course1.displayCourseDetails();
        course2.displayCourseDetails();

        professor1.displayProfessorDetails();
        professor2.displayProfessorDetails();
    }
}
