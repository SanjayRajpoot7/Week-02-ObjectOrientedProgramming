import java.util.ArrayList;
import java.util.List;

// Faculty class representing a faculty member in the university
class Faculty {
    private String name;
    private String specialization;

    // Constructor
    public Faculty(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    // Method to display faculty details
    public void displayFacultyDetails() {
        System.out.println("Faculty Name: " + name + " | Specialization: " + specialization);
    }
}

// Department class representing a department in the university
class Department {
    private String departmentName;
    private List<Faculty> faculties;

    // Constructor
    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.faculties = new ArrayList<>();
    }

    // Method to assign faculty to the department
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    // Method to display department details and its faculties
    public void displayDepartmentDetails() {
        System.out.println("Department: " + departmentName);
        if (faculties.isEmpty()) {
            System.out.println("  No faculties assigned.");
        } else {
            System.out.println("  Faculties in " + departmentName + ":");
            for (Faculty faculty : faculties) {
                faculty.displayFacultyDetails();
            }
        }
    }

    // Getter method
    public String getDepartmentName() {
        return departmentName;
    }
}

// University class representing a university
class University {
    private String universityName;
    private List<Department> departments;

    // Constructor
    public University(String universityName) {
        this.universityName = universityName;
        this.departments = new ArrayList<>();
    }

    // Method to add department to the university
    public void addDepartment(Department department) {
        departments.add(department);
    }

    // Method to display university and its departments
    public void displayUniversityDetails() {
        System.out.println("University: " + universityName);
        if (departments.isEmpty()) {
            System.out.println("  No departments available.");
        } else {
            System.out.println("Departments in " + universityName + ":");
            for (Department department : departments) {
                department.displayDepartmentDetails();
            }
        }
    }

    // Method to delete university and all its departments (Composition)
    public void deleteUniversity() {
        System.out.println("Deleting university: " + universityName);
        departments.clear();  // Deleting all departments when the university is deleted
    }
}

// Main class to test the system
public class UniversitySystem {
    public static void main(String[] args) {
        // Create Faculty members
        Faculty faculty1 = new Faculty("Dr. Smith", "Computer Science");
        Faculty faculty2 = new Faculty("Dr. Johnson", "Mathematics");
        Faculty faculty3 = new Faculty("Dr. Lee", "Physics");

        // Create Departments
        Department department1 = new Department("Computer Science");
        Department department2 = new Department("Mathematics");

        // Assign faculties to departments
        department1.addFaculty(faculty1);
        department2.addFaculty(faculty2);
        department2.addFaculty(faculty3);

        // Create University
        University university = new University("Atul University");

        // Add departments to university
        university.addDepartment(department1);
        university.addDepartment(department2);

        // Display details before deleting theimport java.util.ArrayList;
        //import java.util.List;
        //
        //// Faculty class representing a faculty member in the university
        //class Faculty {
        //    private String name;
        //    private String specialization;
        //
        //    // Constructor
        //    public Faculty(String name, String specialization) {
        //        this.name = name;
        //        this.specialization = specialization;
        //    }
        //
        //    // Getter methods
        //    public String getName() {
        //        return name;
        //    }
        //
        //    public String getSpecialization() {
        //        return specialization;
        //    }
        //
        //    // Method to display faculty details
        //    public void displayFacultyDetails() {
        //        System.out.println("Faculty Name: " + name + " | Specialization: " + specialization);
        //    }
        //}
        //
        //// Department class representing a department in the university
        //class Department {
        //    private String departmentName;
        //    private List<Faculty> faculties;
        //
        //    // Constructor
        //    public Department(String departmentName) {
        //        this.departmentName = departmentName;
        //        this.faculties = new ArrayList<>();
        //    }
        //
        //    // Method to assign faculty to the department
        //    public void addFaculty(Faculty faculty) {
        //        faculties.add(faculty);
        //    }
        //
        //    // Method to display department details and its faculties
        //    public void displayDepartmentDetails() {
        //        System.out.println("Department: " + departmentName);
        //        if (faculties.isEmpty()) {
        //            System.out.println("  No faculties assigned.");
        //        } else {
        //            System.out.println("  Faculties in " + departmentName + ":");
        //            for (Faculty faculty : faculties) {
        //                faculty.displayFacultyDetails();
        //            }
        //        }
        //    }
        //
        //    // Getter method
        //    public String getDepartmentName() {
        //        return departmentName;
        //    }
        //}
        //
        //// University class representing a university
        //class University {
        //    private String universityName;
        //    private List<Department> departments;
        //
        //    // Constructor
        //    public University(String universityName) {
        //        this.universityName = universityName;
        //        this.departments = new ArrayList<>();
        //    }
        //
        //    // Method to add department to the university
        //    public void addDepartment(Department department) {
        //        departments.add(department);
        //    }
        //
        //    // Method to display university and its departments
        //    public void displayUniversityDetails() {
        //        System.out.println("University: " + universityName);
        //        if (departments.isEmpty()) {
        //            System.out.println("  No departments available.");
        //        } else {
        //            System.out.println("Departments in " + universityName + ":");
        //            for (Department department : departments) {
        //                department.displayDepartmentDetails();
        //            }
        //        }
        //    }
        //
        //    // Method to delete university and all its departments (Composition)
        //    public void deleteUniversity() {
        //        System.out.println("Deleting university: " + universityName);
        //        departments.clear();  // Deleting all departments when the university is deleted
        //    }
        //}
        //
        //// Main class to test the system
        //public class UniversitySystem {
        //    public static void main(String[] args) {
        //        // Create Faculty members
        //        Faculty faculty1 = new Faculty("Dr. Smith", "Computer Science");
        //        Faculty faculty2 = new Faculty("Dr. Johnson", "Mathematics");
        //        Faculty faculty3 = new Faculty("Dr. Lee", "Physics");
        //
        //        // Create Departments
        //        Department department1 = new Department("Computer Science");
        //        Department department2 = new Department("Mathematics");
        //
        //        // Assign faculties to departments
        //        department1.addFaculty(faculty1);
        //        department2.addFaculty(faculty2);
        //        department2.addFaculty(faculty3);
        //
        //        // Create University
        //        University university = new University("Atul University");
        //
        //        // Add departments to university
        //        university.addDepartment(department1);
        //        university.addDepartment(department2);
        //
        //        // Display details before deleting the university
        //        university.displayUniversityDetails();
        //
        //        // Deleting university and its departments (Composition)
        //        university.deleteUniversity();
        //
        //        // Display details after deleting the university
        //        university.displayUniversityDetails();  // Should show no departments
        //    }
        //} university
        university.displayUniversityDetails();

        // Deleting university and its departments (Composition)
        university.deleteUniversity();

        // Display details after deleting the university
        university.displayUniversityDetails();  // Should show no departments
    }
}
