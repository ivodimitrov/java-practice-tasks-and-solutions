package javafortesters.chap05;

import javafortesters.domainobject.TestAppEnv;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAppEnvironmentTest {

    @Test
    public void canGetUrlStatically() {

        assertEquals("Returns Hard Coded URL",
                "http://192.123.0.3:67",
                TestAppEnv.getUrl());
    }
}
