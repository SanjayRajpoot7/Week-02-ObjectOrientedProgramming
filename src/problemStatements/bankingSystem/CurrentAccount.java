package problemStatements.bankingSystem;

public class CurrentAccount extends BankAccount implements Loanable {
    private static final double currentInterestRate = 0.02;

    public CurrentAccount(long accountNumber, String holderName, double balance){
        super(accountNumber,holderName,balance);
    }

    public double calculateInterest(){
        return (getBalance() * currentInterestRate);
    }

    public void applyForLoan(double amount){
        System.out.println("Loan applied for: "+amount);
    }

    public boolean calculateLoanEligibility() {
        if (getBalance() > 1000) {
            System.out.println("Loan eligibility: Approved");
            return true;
        } else {
            System.out.println("Loan eligibility: Denied");
            return false;
        }
    }

}
