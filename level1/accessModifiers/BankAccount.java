// Parent class: BankAccount
class BankAccount {
    // Public field
    public String accountNumber;


    // Protected field
    protected String accountHolder;


    // Private field
    private double balance;


    // Constructor
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }


    // Public method to get the balance
    public double getBalance() {
        return balance;
    }


    // Public method to modify the balance
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative.");
        }
    }


    // Method to display account information
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + getBalance());
    }
}


// Subclass: SavingsAccount
class SavingsAccount extends BankAccount {
    // Constructor
    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance); // Call the constructor of the parent class
    }


    // Method to display SavingsAccount information
    public void displaySavingsInfo() {
        // Access accountNumber and accountHolder directly
        System.out.println("Savings Account Information:");
        System.out.println("Account Number: " + accountNumber); // Public field can be accessed
        System.out.println("Account Holder: " + accountHolder); // Protected field can be accessed
        System.out.println("Balance: " + getBalance()); // Accessing private balance via public method
    }


    public static void main(String[] args) {
        // Create a BankAccount instance
        BankAccount bankAccount = new BankAccount("1234567890", "John Doe", 1000.0);
        bankAccount.displayAccountInfo();


        System.out.println();


        // Modify balance using setBalance method
        bankAccount.setBalance(1500.0);
        bankAccount.displayAccountInfo();


        System.out.println();


        // Create a SavingsAccount instance
        SavingsAccount savingsAccount = new SavingsAccount("9876543210", "Alice Smith", 5000.0);
        savingsAccount.displaySavingsInfo();
    }
}
