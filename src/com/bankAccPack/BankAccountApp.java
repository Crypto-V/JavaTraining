package com.bankAccPack;

public class BankAccountApp {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("465329874", 1000);
        BankAccount acc2 = new BankAccount("465329874", 2000);
        BankAccount acc3 = new BankAccount("465329874", 2500);

        acc1.setName("Jim");
        System.out.println(acc1.getName());
        acc1.makeDeposit(500);
        acc1.makeDeposit(600);
        acc1.payBill(1000);
        acc1.accrue();
        System.out.println(acc1.toString());

    }

}


class BankAccount implements IInterest {
    //properties of bank account
    private static int ID = 1000;               //Internal ID
    private String accountNumber; //id+random 2 digit number +first 2 digits of ssn.
    private static final String routingNumber = "005400657";
    private String name;
    private String SSN;
    private double balance;

    //Create constructors
    public BankAccount(String SSN, double initDeposit) {
        balance = initDeposit;
        System.out.println("New account created !");
        this.SSN = SSN;
        ID++;
        setAccountNumber();
    }

    private void setAccountNumber() {
        int random = (int) (Math.random() * 100);
        accountNumber = ID + "" + random + SSN.substring(0, 2);
        System.out.println("Your account number: " + accountNumber);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void payBill(double amount) {
        balance = balance - amount;
        System.out.println("Paying bill of: " + amount);
        showBalance();
    }

    public void makeDeposit(double amount) {
        System.out.println("Making deposit: " + amount);
        balance = balance + amount;
        showBalance();
    }

    public void showBalance() {
        System.out.println("Balance: " + balance);
    }


    @Override
    public void accrue() {
        balance = balance * (1 + rate / 100);
        showBalance();
    }

    @Override
    public String toString() {
        return "[Name: "+name+" , Account Number: "+accountNumber+", Rounting Number: "+routingNumber+", Balance: "+balance+"]";
    }
}
