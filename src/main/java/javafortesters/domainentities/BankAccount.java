package javafortesters.domainentities;

public class BankAccount {

    private int account;
    private int balance;

    public BankAccount() {
        this(0, 0);
    }

    public BankAccount(int account, int balance) {
        this.account = account;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return account;
    }

    public void setAccountNumber(int account) {
        this.account = account;
    }

    public int getAccountBalance() {
        return balance;
    }

    public void setAccountBalance(int balance) {
        this.balance = balance;
    }
}
