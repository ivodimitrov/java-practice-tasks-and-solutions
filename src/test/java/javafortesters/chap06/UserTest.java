package javafortesters.chap06;

import javafortesters.domainentities.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {

    @Test
    public void userHasDefaultUsernameAndPassword() {

        User user = new User();

        assertEquals("Default username expected", "username",
                user.getUsername());

        assertEquals("Default password expected", "password",
                user.getPassword());
    }

    @Test
    public void canConstructWithUsernameAndPassword() {

        User user = new User("admin", "pA55w0rd");

        assertEquals("Given username expected", "admin",
                user.getUsername());

        assertEquals("Given password excepted", "pA55w0rd",
                user.getPassword());
    }

    @Test
    public void canSetPasswordAfterConstructed() {

        User user = new User();

        user.setPassword("P@ZZwOr6");

        assertEquals("Setter password expected", "P@ZZw0r6",
                user.getPassword());
    }

}
