import java.util.Scanner;

public class BankAccount {

    static String accountHolder;
    static long accountNumber;
    double balance;

    BankAccount(String accountHolder, long accountNumber, double balance){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
        System.out.println("Current balance: "+balance);
    }

    // long availBalance = 0;
    static int depositMoney = 76000;

    private double depositMoney(){
        if(accountNumber == 978548017){
            if(depositMoney > 0) {
                balance += depositMoney;
            }
        }
     return balance;
    }

   static int withdrawMoney = 124200;

    private double withdrawMoney(){
        if(accountNumber == 978548017){
            if(withdrawMoney > 0) {
                balance -= withdrawMoney;
            }
        }
        return balance;
    }

    private void currentBalance(){
        System.out.println("Available balance is: "+balance);
    }
    public static void main(String[] args) {
     BankAccount obj = new BankAccount("Sanjay",978548017,763560);
     double value1 = obj.depositMoney();
     double value2 = obj.withdrawMoney();

        System.out.println("Bank account holder name is: "+accountHolder);
        System.out.println("Bank account number is: "+accountNumber);
        System.out.println("Deposit money: "+depositMoney);
        System.out.println("After deposite balance is: "+value1);
        System.out.println("Withdrawl money: "+withdrawMoney);
        System.out.println("After withdrawl balance is: "+value2);
        System.out.println();
        obj.currentBalance();

    }
}
