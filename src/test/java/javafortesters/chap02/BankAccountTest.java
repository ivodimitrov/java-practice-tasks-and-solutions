package javafortesters.chap02;

import javafortesters.domainentities.BankAccount;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BankAccountTest extends BankAccount {

    private int limit;

    @Test
    public void bankAccountHasDefaultAccountNumberAndBalance() {

        limit = 400;
        int accountNumber = getAccount();
        int accountBalance = getBalance();

        assertEquals("Expected limit",
                400, limit);

        assertEquals("Expected account number",
                0, accountNumber);

        assertEquals("Expected balance",
                0, accountBalance);
    }

    @Test
    public void canSetAccountNumberAndBalance() {

        setAccount(1001);
        int accountNumber = getAccount();

        setBalance(9999);
        int accountBalance = getAccount();

        assertEquals("Expected account number",
                1001, accountNumber);

        assertEquals("Expected balance",
                9999, accountBalance);
    }
}
