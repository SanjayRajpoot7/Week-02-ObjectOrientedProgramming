package problemStatements.bankingSystem;

public interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();

}
