package problemStatements.hospitalManagementSystem;

// Abstract class Patient
public abstract class Patient {
    private String patientId;
    private String name;
    private int age;

    // Constructor to initialize patient details
    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Abstract method to calculate the bill (to be implemented by subclasses)
    public abstract double calculateBill();

    // Concrete method to return patient details
    public String getPatientDetails() {
        return "Patient ID: " + patientId + "\nName: " + name + "\nAge: " + age;
    }

    // Getter methods
    public String getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

