package javafortesters.exploringjunit;

import javafortesters.exceptions.custom.InvalidPassword;
import javafortesters.exceptions.custom.User;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class JunitExpectedExceptionRuleTest {

    @Rule
    public ExpectedException expected = ExpectedException.none();

    @Test
    public void invalidPasswordThrown() throws InvalidPassword {

        expected.expect(InvalidPassword.class);
        User user = new User("username", "<6");
    }
}
