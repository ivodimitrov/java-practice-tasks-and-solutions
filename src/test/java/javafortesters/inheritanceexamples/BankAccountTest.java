package javafortesters.inheritanceexamples;

import javafortesters.domainentities.BankAccount;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BankAccountTest extends BankAccount {

    private int limit;

    @Test
    public void bankAccountHasDefaultAccountNumberAndBalance() {

        limit = 400;
        int accountNumber = super.getAccountNumber();
        int accountBalance = super.getAccountBalance();

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

        assertEquals("Expected account number",
                1001, accountNumber);

        addAmountToAccountBalance(9999);

        subtractAmountToAccountBalance(1111);

        int accountBalance = getAccountBalance();

        assertEquals("Expected account balance",
                8888, accountBalance);

       printAccountBalance();
    }
}
