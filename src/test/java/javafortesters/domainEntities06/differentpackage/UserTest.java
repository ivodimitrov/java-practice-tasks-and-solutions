package javafortesters.domainEntities06.differentpackage;

import javafortesters.domainentities.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {

    @Test
    public void canConstructWithUsernameAndPassword() {

        User user = new User("admin", "pA55w0rD");

        assertEquals("Given username expected", "admin",
                user.getUsername());

        assertEquals("Given password expected", "pA55w0rD",
                user.getPassword());
    }
}
