package problemStatements.hospitalManagementSystem;

public class InPatient extends Patient {
        private int daysAdmitted;

        public InPatient(String patientId, String name, int age, int daysAdmitted) {
            super(patientId, name, age);
            this.daysAdmitted = daysAdmitted;
        }

        @Override
        public double calculateBill() {
            // Inpatient billing: base cost + room charges + daily charges
            double dailyRate = 150.00;  // Example daily room rate
            double medicalCharges = 500.00;  // Example additional medical charges
            return (dailyRate * daysAdmitted) + medicalCharges;
        }

}
