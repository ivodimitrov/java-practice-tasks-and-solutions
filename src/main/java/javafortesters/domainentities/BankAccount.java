package javafortesters.domainentities;

public class BankAccount {

    private int accountNumber;
    private int balance;

    public BankAccount() {
        this(0, 0);
    }

    public BankAccount(int accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountBalance() {
        return balance;
    }

    public int addAmountToAccountBalance(int balance) {
        return this.balance += balance;
    }

    public int subtractAmountToAccountBalance(int balance) {
        return this.balance -= balance;
    }

    public final void printAccountBalance() {
        System.out.println(balance);
    }
}
