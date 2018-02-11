package javafortesters.moreexceptions;

import javafortesters.exceptions.custom.InvalidPassword;
import javafortesters.exceptions.custom.User;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomExceptionsTest {

    @Test
    public void canCreateDefaultUserWithoutHandlingException() {
        User aUser = new User();

        assertEquals("username", aUser.getUsername());
        assertEquals("password", aUser.getPassword());
    }

    @Test
    public void haveToCatchIllegalPasswordForParamConstructor() {

        try {
            javafortesters.exceptions.custom.User aUser = new javafortesters.exceptions.custom.User("me", "wrong");
            fail("An exception should have been thrown");
        } catch (InvalidPassword invalidPassword) {
            assertTrue("The exception was thrown", true);
        }
    }

    @Test(expected = InvalidPassword.class)
    public void propogateIllegalPasswordExpected() throws InvalidPassword {
        User aUser = new User("me", "bad");
    }
}
