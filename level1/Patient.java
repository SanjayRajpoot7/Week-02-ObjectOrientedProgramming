package level1;
class Patient {
    // Static variable: shared among all instances
    static String hospitalName = "City Hospital"; // Shared hospital name for all patients
    static int totalPatients = 0; // Counter to keep track of the total number of patients admitted

    // Final variable: patient ID is immutable once assigned
    final int patientID;

    // Instance variables: patient details
    String name;
    int age;
    String ailment;

    // Constructor to initialize patient details and increment totalPatients
    public Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++; // Increment total patient count upon each new patient
    }

    // Static method to get the total number of patients admitted
    public static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }

    // Method to display patient details if the object is an instance of Patient
    public void displayPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("Patient Details:");
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
            System.out.println("Hospital: " + hospitalName);
        } else {
            System.out.println("Error: Object is not an instance of Patient.");
        }
    }

    // Static method to check if an object is an instance of Patient
    public static boolean isInstanceOfPatient(Object obj) {
        return obj instanceof Patient;
    }

    public static void main(String[] args) {
        // Create a few patients
        Patient patient1 = new Patient(101, "John Doe", 45, "Fever");
        Patient patient2 = new Patient(102, "Jane Smith", 60, "Cough");
        Patient patient3 = new Patient(103, "Alice Johnson", 30, "Fracture");

        // Display total patients admitted
        Patient.getTotalPatients();

        // Display details of each patient
        patient1.displayPatientDetails();
        System.out.println("-------------------------------");
        patient2.displayPatientDetails();
        System.out.println("-------------------------------");
        patient3.displayPatientDetails();

        // Check if an object is an instance of Patient class
        if (Patient.isInstanceOfPatient(patient1)) {
            System.out.println("\npatient1 is an instance of Patient.");
        }

        // Check an object that is not an instance of Patient
        String nonPatient = "Not a patient";
        if (Patient.isInstanceOfPatient(nonPatient)) {
            System.out.println("This is a patient.");
        } else {
            System.out.println("This is not a patient.");
        }
    }
}
