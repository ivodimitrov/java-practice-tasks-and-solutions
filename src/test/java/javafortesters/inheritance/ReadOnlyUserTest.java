package javafortesters.inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReadOnlyUserTest {

    @Test
    public void readOnlyUserPrivsAndDefaults() {
        ReadOnlyUser readOnlyUser = new ReadOnlyUser();

        assertEquals("ReadOnly", readOnlyUser.getPermission());
        assertEquals("username", readOnlyUser.getUsername());
        assertEquals("password", readOnlyUser.getPassword());
    }
}
