package javafortesters.chap02;

import javafortesters.domainentities.BankAccount;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BankAccountTest extends BankAccount {

    private int limit;

    @Test
    public void bankAccountHasDefaultAccountNumberAndBalance() {

        limit = 400;
        int accountNumber = getAccountNumber();
        int accountBalance = getAccountBalance();

        assertEquals("Expected limit",
                400, limit);

        assertEquals("Default account number",
                0, accountNumber);

        assertEquals("Default account balance",
                0, accountBalance);
    }

    @Test
    public void canConstructWithAccountNumberAndBalance() {

        BankAccount bankAccount = new BankAccount(1000, 8888);

        int accountNumber = bankAccount.getAccountNumber();
        int accountBalance = bankAccount.getAccountBalance();

        assertEquals("Given account number",
                1000, accountNumber);

        assertEquals("Given account balance",
                8888, accountBalance);
    }

    @Test
    public void canSetAccountNumberAndBalance() {

        setAccountNumber(1001);
        int accountNumber = getAccountNumber();

        setAccountBalance(9999);
        int accountBalance = getAccountNumber();

        assertEquals("Expected account number",
                1001, accountNumber);

        assertEquals("Expected balance",
                9999, accountBalance);
    }
}
