// Parent class: Student
class Student {
    // Public instance variable
    public int rollNumber;


    // Protected instance variable (accessible in subclass)
    protected String name;


    // Private instance variable (with public getter and setter)
    private double CGPA;


    // Constructor to initialize student details
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }


    // Public method to get the CGPA (getter)
    public double getCGPA() {
        return CGPA;
    }


    // Public method to set the CGPA (setter)
    public void setCGPA(double CGPA) {
        if (CGPA >= 0 && CGPA <= 10) {
            this.CGPA = CGPA;
        } else {
            System.out.println("Invalid CGPA. It must be between 0 and 10.");
        }
    }


    // Method to display student details
    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}


// Subclass: PostgraduateStudent
class PostgraduateStudent extends Student {
    // Additional attribute for PostgraduateStudent
    private String researchTopic;


    // Constructor to initialize PostgraduateStudent details
    public PostgraduateStudent(int rollNumber, String name, double CGPA, String researchTopic) {
        super(rollNumber, name, CGPA); // Calling the superclass constructor
        this.researchTopic = researchTopic;
    }


    // Method to display PostgraduateStudent details (including inherited properties)
    @Override
    public void displayDetails() {
        super.displayDetails(); // Calling the superclass method to display common details
        System.out.println("Research Topic: " + researchTopic);
    }


    // Method to demonstrate access to the protected member (name) of the parent class
    public void changeName(String newName) {
        this.name = newName; // Accessing the protected 'name' from the superclass
    }


    public static void main(String[] args) {
        // Create a Student object
        Student student1 = new Student(101, "John Doe", 8.5);
        student1.displayDetails();
        System.out.println();


        // Create a PostgraduateStudent object
        PostgraduateStudent postgrad1 = new PostgraduateStudent(201, "Jane Smith", 9.0, "Artificial Intelligence");
        postgrad1.displayDetails();


        // Modify CGPA using setter method
        student1.setCGPA(9.2);
        System.out.println("\nUpdated Student 1 Details:");
        student1.displayDetails();
        System.out.println();


        // Access and modify the protected 'name' in the subclass
        postgrad1.changeName("Jessica Smith");
        System.out.println("\nUpdated PostgraduateStudent 1 Details:");
        postgrad1.displayDetails();
    }
}


