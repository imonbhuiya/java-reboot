package org.example.oop.Encapsulation;

public class BankAccount {

    // Fields
    private String owner;
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String owner, String accountNumber, double balance){

        this.owner = owner;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getter
    public double getBalance(){
        return balance;
    }

    // deposit()
  public void deposit (double amount){

        if( amount > 0){
            balance = balance + amount;
        }

  }

    // withdraw()
    public void withdraw( double amount){

        if( amount > 0 && amount <= balance ){
            balance -= amount;
        }

    }


    public static void main(String[] args) {

        BankAccount customar1 =
                new BankAccount("Alex", "DE12310", 1000);

        System.out.println(customar1.getBalance());

        customar1.deposit(100);

        System.out.println(customar1.getBalance());

        customar1.withdraw(500);
        System.out.println(customar1.getBalance());
    }
}