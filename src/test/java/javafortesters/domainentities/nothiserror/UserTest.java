package javafortesters.domainentities.nothiserror;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {

    @Test(expected = AssertionError.class)
    public void canConstructWithUsernameAndPassword() {

        User user = new User("admin", "pA55w0rD");

        assertEquals("Given username expected", "admin",
                user.getUsername());

        assertEquals("Given password expected", "pA55w0rD",
                user.getPassword());
    }
}
