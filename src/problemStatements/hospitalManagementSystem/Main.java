package problemStatements.hospitalManagementSystem;

public class Main {
    public static void main(String[] args) {
        // Create instances of InPatient and OutPatient
        Patient inPatient = new InPatient("56", "Jatin", 45, 5);
        Patient outPatient = new OutPatient("1009", "Rahul", 30, 100.00);

        // Process a list of patients and display their billing details dynamically using polymorphism
        Patient[] patients = {inPatient, outPatient};

        double totalAmount = 0;
        for (Patient patient : patients) {
            System.out.println(patient.getPatientDetails());
            double bill = patient.calculateBill();
            System.out.println("Total Bill: $" + bill);
            totalAmount += bill;
            System.out.println();
        }

        System.out.println("Total Bill for All Patients: $" + totalAmount);
    }

}
