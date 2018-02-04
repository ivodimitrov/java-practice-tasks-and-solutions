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

    public int getAccount() {
        return account;

    }

    public void setAccount(int account) {
        this.account = account;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
