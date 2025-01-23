import java.util.ArrayList;

// Hospital class that manages Doctors and Patients
class Hospital {
    private String hospitalName;
    private ArrayList<Doctor> doctors;  // Association: Hospital has many Doctors
    private ArrayList<Patient> patients; // Association: Hospital has many Patients

    // Constructor to initialize Hospital
    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    // Method to add a Doctor to the Hospital
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    // Method to add a Patient to the Hospital
    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    // Method to display Hospital details, Doctors and Patients
    public void displayHospitalDetails() {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Doctors:");
        for (Doctor doctor : doctors) {
            System.out.println("  " + doctor.getName());
        }
        System.out.println("Patients:");
        for (Patient patient : patients) {
            System.out.println("  " + patient.getName());
        }
    }
}

// Doctor class that can consult multiple Patients
class Doctor {
    private String name;
    private String specialization;
    private ArrayList<Patient> patients;  // Association: Doctor has many Patients

    // Constructor to initialize Doctor
    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
        this.patients = new ArrayList<>();
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Method for Doctor to consult with a Patient
    public void consult(Patient patient) {
        patients.add(patient);
        System.out.println(name + " (Specialization: " + specialization + ") is consulting " + patient.getName() + ".");
    }

    // Method to display Doctor's details
    public void displayDoctorDetails() {
        System.out.println("  Doctor: " + name + ", Specialization: " + specialization);
    }

    // Method to show all patients the Doctor is consulting
    public void showPatients() {
        if (patients.isEmpty()) {
            System.out.println("  No patients consulted yet.");
        } else {
            System.out.println("  Patients consulted by Dr. " + name + ":");
            for (Patient patient : patients) {
                System.out.println("    " + patient.getName());
            }
        }
    }
}

// Patient class that can consult multiple Doctors
class Patient {
    private String name;
    private ArrayList<Doctor> doctors;  // Association: Patient has many Doctors

    // Constructor to initialize Patient
    public Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Method for Patient to consult with a Doctor
    public void consult(Doctor doctor) {
        doctors.add(doctor);
        System.out.println(name + " is consulting Dr. " + doctor.getName() + ".");
    }

    // Method to display Patient's details
    public void displayPatientDetails() {
        System.out.println("  Patient: " + name);
    }

    // Method to show all doctors the Patient has consulted
    public void showDoctors() {
        if (doctors.isEmpty()) {
            System.out.println("  No doctors consulted yet.");
        } else {
            System.out.println("  Doctors consulted by " + name + ":");
            for (Doctor doctor : doctors) {
                System.out.println("    " + doctor.getName());
            }
        }
    }

    public static void main(String[] args) {
        // Create a Hospital
        Hospital hospital = new Hospital("City Hospital");

        // Create Doctors
        Doctor doctor1 = new Doctor("Dr. Smith", "Cardiologist");
        Doctor doctor2 = new Doctor("Dr. Johnson", "Orthopedic Surgeon");

        // Create Patients
        Patient patient1 = new Patient("Alice");
        Patient patient2 = new Patient("Bob");

        // Add Doctors and Patients to the Hospital
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        // Display the Hospital details
        hospital.displayHospitalDetails();

        // Perform consultations (communication between Doctor and Patient)
        doctor1.consult(patient1);  // Dr. Smith consults Alice
        doctor2.consult(patient1);  // Dr. Johnson consults Alice
        doctor1.consult(patient2);  // Dr. Smith consults Bob

        // Display consultation details for each doctor
        doctor1.showPatients();
        doctor2.showPatients();

        // Display consultation details for each patient
        patient1.showDoctors();
        patient2.showDoctors();
    }
}
