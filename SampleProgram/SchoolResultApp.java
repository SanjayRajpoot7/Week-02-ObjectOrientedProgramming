import java.util.ArrayList;
import java.util.List;

// Class representing a Subject with name and marks
class Subject {
    private String subjectName;
    private int marks;

    // Constructor to initialize the subject and marks
    public Subject(String subjectName, int marks) {
        this.subjectName = subjectName;
        this.marks = marks;
    }

    // Getter methods for subject name and marks
    public String getSubjectName() {
        return subjectName;
    }

    public int getMarks() {
        return marks;
    }
}

// Class representing a Student who can have multiple subjects
class Student {
    private String name;
    private List<Subject> subjects;

    // Constructor to initialize the student
    public Student(String name) {
        this.name = name;
        this.subjects = new ArrayList<>();
    }

    // Method to add a subject to the student's list of subjects
    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    // Getter method for student's name
    public String getName() {
        return name;
    }

    // Getter method for student's subjects
    public List<Subject> getSubjects() {
        return subjects;
    }
}

// Class to calculate the grades for the Student
class GradeCalculator {

    // Method to calculate grade based on marks
    public String calculateGrade(Student student) {
        double totalMarks = 0;
        int subjectCount = student.getSubjects().size();

        // Sum the marks of all subjects
        for (Subject subject : student.getSubjects()) {
            totalMarks += subject.getMarks();
        }

        // Calculate average marks
        double averageMarks = totalMarks / subjectCount;

        // Return grade based on average marks
        if (averageMarks >= 90) {
            return "A+";
        } else if (averageMarks >= 80) {
            return "A";
        } else if (averageMarks >= 70) {
            return "B";
        } else if (averageMarks >= 60) {
            return "C";
        } else {
            return "F";
        }
    }
}

// Main class to simulate the School Results Application
public class SchoolResultApp {

    public static void main(String[] args) {
        // Create subjects with marks
        Subject math = new Subject("Math", 85);
        Subject science = new Subject("Science", 90);
        Subject history = new Subject("History", 75);

        // Create a student
        Student student = new Student("John Doe");

        // Add subjects to the student's list
        student.addSubject(math);
        student.addSubject(science);
        student.addSubject(history);

        // Create GradeCalculator to calculate the student's grade
        GradeCalculator gradeCalculator = new GradeCalculator();

        // Calculate the grade based on the student's subjects
        String grade = gradeCalculator.calculateGrade(student);

        // Display the student's information and grade
        System.out.println("Student: " + student.getName());
        System.out.println("Subjects and Marks:");
        for (Subject subject : student.getSubjects()) {
            System.out.println("- " + subject.getSubjectName() + ": " + subject.getMarks());
        }
        System.out.println("Grade: " + grade);
    }
}
