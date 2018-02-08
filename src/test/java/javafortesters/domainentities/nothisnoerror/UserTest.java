package javafortesters.domainentities.nothisnoerror;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {

    @Test
    public void canConstructWithUsernameAndPassword() {

        User user = new User("admin", "P@55w0r6");

        assertEquals("Given username expected", "admin",
                user.getUsername());

        assertEquals("Given password expected", "P@55w0r6",
                user.getPassword());
    }
}
