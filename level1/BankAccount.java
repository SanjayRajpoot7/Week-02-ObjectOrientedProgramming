public class BankAccount {

    static String bankName;
    String accountHolderName;
    final int accountNumber;

    static int countAccount = 0;

    BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;

        countAccount++;
    }


    public static void getTotalAccounts() {
        System.out.println("Total account: " + countAccount);
    }

    public void display(){

        if (this instanceof BankAccount) {
            System.out.println("bankAccount is an instance of bank account class");
        } else {
            System.out.println("bankAccount is not instance of bank account class");
        }

        System.out.println("Bank name is: "+bankName);
        System.out.println("Account holder name is: "+accountHolderName);
        System.out.println("Account number is: "+accountNumber);
    }


    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Sanjay", 147348);
        BankAccount bankAccount2 = new BankAccount("Pratap", 24358912);

        bankName = "SBI";
        bankAccount.display();
        BankAccount.getTotalAccounts();

        System.out.println();

        bankName = "Punjab National Bank";
        bankAccount2.display();

    }
}


