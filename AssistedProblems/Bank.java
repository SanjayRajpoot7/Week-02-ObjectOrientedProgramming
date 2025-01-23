import java.util.ArrayList;

class Bank {
    private String bankName;
    private ArrayList<Customer> customers;

    // Constructor to initialize the bank
    public Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }

    // Method to open a new account for a customer
    public void openAccount(Customer customer, BankAccount account) {
        // Add customer to the bank's list of customers if not already added
        if (!customers.contains(customer)) {
            customers.add(customer);
        }
        // Add the account to the customer's list of accounts
        customer.addAccount(account);
    }

    // Method to view all customers of the bank
    public void displayCustomers() {
        System.out.println("Bank: " + bankName);
        for (Customer customer : customers) {
            System.out.println("Customer: " + customer.getName());
        }
    }
}

class Customer {
    private String name;
    private ArrayList<BankAccount> accounts;

    // Constructor to initialize customer
    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    // Method to get the customer's name
    public String getName() {
        return name;
    }

    // Method to add an account to the customer's list
    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    // Method to view balance of all accounts
    public void viewBalance() {
        System.out.println("Account Balances for " + name + ":");
        for (BankAccount account : accounts) {
            System.out.println("Account Type: " + account.getAccountType() + " | Balance: $" + account.getBalance());
        }
    }
}

class BankAccount {
    private String accountType;
    private double balance;

    // Constructor to initialize account
    public BankAccount(String accountType, double initialDeposit) {
        this.accountType = accountType;
        this.balance = initialDeposit;
    }

    // Getter for account type
    public String getAccountType() {
        return accountType;
    }

    // Getter for account balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        balance += amount;
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public static void main(String[] args) {
        // Create a Bank instance
        Bank bank = new Bank("ABC Bank");

        // Create Customer instances
        Customer customer1 = new Customer("John Doe");
        Customer customer2 = new Customer("Jane Smith");

        // Create BankAccount instances
        BankAccount account1 = new BankAccount("Savings", 1000.00);
        BankAccount account2 = new BankAccount("Checking", 500.00);
        BankAccount account3 = new BankAccount("Savings", 1500.00);

        // Open accounts for the customers in the bank
        bank.openAccount(customer1, account1);
        bank.openAccount(customer1, account2);
        bank.openAccount(customer2, account3);

        // Display all customers in the bank
        bank.displayCustomers();

        // View balances for each customer
        customer1.viewBalance();
        customer2.viewBalance();

        // Perform some transactions
        account1.deposit(200.00);
        account2.withdraw(100.00);

        // View updated balances
        System.out.println("\nUpdated balances:");
        customer1.viewBalance();
    }
}
