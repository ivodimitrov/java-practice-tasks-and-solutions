package javafortesters.chap06.publicfields;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {

    @Test
    public void canConstructWithUsernameAndPassword() {

        User auser = new User();

        auser.username = "bob";
        auser.password = "p@5Zw0r6";

        assertEquals("Not default username expected", "bob",
                auser.username);
        assertEquals("Not default username expected", "p@5Zw0r6",
                auser.password);
    }

    @Test
    public void canSetNameToInvalidValue() {

        User auser = new User();

        auser.username = "12345£$%$";

        assertEquals("Invalid username",
                "12345£$%$",
                auser.username);
    }
}
