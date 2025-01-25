package Hierarchical_Inheritance.BankAccountTypes;

public class BankAccount {
    protected String accountNumber;
    protected double balance;

    // Constructor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        balance += amount;
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    // Method to display the account type
    public void displayAccountType() {
        System.out.println("This is a General Bank Account.");
    }

    // Method to display balance
    public void displayBalance() {
        System.out.println("Balance: $" + balance);
    }

}
