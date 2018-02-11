package javafortesters.inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnvironmentUserTest {

    @Test
    public void createAnEnvironmentUser() {
        EnvironmentUser environmentUser = new EnvironmentUser();

        assertEquals("username", environmentUser.getUsername());
        assertEquals("password", environmentUser.getPassword());
        assertEquals("http://192.123.0.3:67", environmentUser.getUrl());
    }
}
