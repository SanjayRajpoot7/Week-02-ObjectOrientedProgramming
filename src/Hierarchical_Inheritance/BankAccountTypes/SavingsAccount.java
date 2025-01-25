package Hierarchical_Inheritance.BankAccountTypes;

public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void displayAccountType() {
        System.out.println("This is a Savings Account.");
    }

    public void applyInterest() {
        balance += balance * (interestRate / 100);
    }
}

