package problemStatements.bankingSystem;

public abstract class BankAccount {
    private long accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(long accountNumber, String holderName, double balance){
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }
    public abstract double calculateInterest();

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposited amount: "+amount);
        }
        else{
            System.out.println("Please enter positive amount ");
        }
    }

    public void withdraw(double amount){
        if(amount <= balance && amount > 0){
            balance -= amount;
            System.out.println("Withdrawn amount: "+amount);
        }
        else{
            System.out.println("Error! found invalid number or insufficient funds. ");
        }
    }

    public void displayDetails(){
        System.out.println("Account number: "+accountNumber+"\nHolder name: "
                +holderName+"\nBalance: "+balance);
        System.out.println("Calculated Interest: "+calculateInterest());
    }

    public double getBalance(){
        return balance;
    }

}
