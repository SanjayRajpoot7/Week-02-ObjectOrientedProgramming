package problemStatements.bankingSystem;

public class SavingsAccount extends BankAccount{
    private static final double savingsInterestRate = 0.02;

    public SavingsAccount(long accountNumber, String holderName, double balance){
        super(accountNumber,holderName,balance);
    }

    public double calculateInterest(){
        return (getBalance() * savingsInterestRate);
    }
}
