package problemStatements.hospitalManagementSystem;

public class OutPatient extends Patient {
        private double consultationFee;

        public OutPatient(String patientId, String name, int age, double consultationFee) {
            super(patientId, name, age);
            this.consultationFee = consultationFee;
        }

        @Override
        public double calculateBill() {
            // Outpatient billing: only consultation fee
            return consultationFee;
        }

}
