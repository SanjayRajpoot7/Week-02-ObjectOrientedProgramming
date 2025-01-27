package problemStatements.bankingSystem;

public class Main {

    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount(748327234,"Sahib",45000);
        BankAccount current = new CurrentAccount(2036272772,"Raju",2400);

        System.out.println("Current Account: ");
        current.displayDetails();

        System.out.println();
        System.out.println("Saving Account: ");
        savings.displayDetails();
        System.out.println();

        // Check loan eligibility for CurrentAccount
        CurrentAccount currentAccount = (CurrentAccount) current; // Casting to access loan methods
        currentAccount.calculateLoanEligibility();
        currentAccount.applyForLoan(5000.0);

        System.out.println();

        // Deposit and Withdraw
        savings.deposit(1000.0);
        savings.withdraw(500.0);
        current.deposit(500.0);
        current.withdraw(200.0);

        System.out.println("Total balance: "+current.getBalance());


    }


}
