package Hierarchical_Inheritance.BankAccountTypes;

public class Main {
    public static void main(String[] args) {
        // Create different accounts
        BankAccount savings = new SavingsAccount("SA123", 1000, 5);  // 5% interest rate
        BankAccount checking = new CheckingAccount("CA123", 500, 300);  // $300 withdrawal limit
        BankAccount fixedDeposit = new FixedDepositAccount("FDA123", 2000, 12);  // 12 months maturity period

        // Display account types and balances
        savings.displayAccountType();
        savings.displayBalance();
        ((SavingsAccount) savings).applyInterest(); // Apply interest
        savings.displayBalance();

        System.out.println();

        checking.displayAccountType();
        checking.displayBalance();
        ((CheckingAccount) checking).checkWithdrawalLimit(200);  // Valid withdrawal
        checking.displayBalance();

        System.out.println();

        fixedDeposit.displayAccountType();
        fixedDeposit.displayBalance();
    }
}
