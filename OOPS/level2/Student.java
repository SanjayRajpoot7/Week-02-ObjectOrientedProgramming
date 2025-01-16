package level2;

public class Student {

    String name;
    int rollNumber;
    double marks;

    Student(String name, int rollNumber, double marks){
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public void displayStudentReport(){
        System.out.println("Student name: "+name+"\nrollNumber: "+rollNumber);
        System.out.println("Grade: ");
        if(marks >= 75){
            System.out.println("A");
        }
        else if(marks > 60 && marks < 75){
            System.out.println("B");
        }
        else if(marks > 60 && marks < 75){
            System.out.println("C");
        }
        else{
            System.out.println("D");
        }
    }
    public static void main(String[] args) {
        Student s = new Student("Sanjay",201143,97);
        s.displayStudentReport();
    }
}
