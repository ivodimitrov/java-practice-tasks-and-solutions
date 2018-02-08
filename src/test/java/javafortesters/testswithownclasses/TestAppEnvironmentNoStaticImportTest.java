package javafortesters.testswithownclasses;

import org.junit.Test;

import static javafortesters.domainobject.TestAppEnv.*;
import static org.junit.Assert.assertEquals;

//import static javafortesters.domainobject.TestAppEnv.DOMAIN;
//import static javafortesters.domainobject.TestAppEnv.PORT;

    /* I could import everything on TestAppEnv statically, and then
    I don't need to prefix getUrl with TestAppEnv
    /*
    import static javafortesters.domainobject.TestAppEnv.*;
    */
    /* If I just import the DOMAIN and PORT then I still need to
    prefix getUrl with TestAppEnv
    import static javafortesters.domainobject.TestAppEnv.DOMAIN;
    import static javafortesters.domainobject.TestAppEnv.PORT;
    */

public class TestAppEnvironmentNoStaticImportTest {

    @Test
    public void canGetUrlStatically() {
        assertEquals("Returns Hard Coded URL",
                "http://192.123.0.3:67",
                getUrl());
    }

    @Test
    public void canGetDomainAndPortStatically() {
        assertEquals("Just the Domain", "192.123.0.3", DOMAIN);

        assertEquals("Just the port", "67", PORT);
    }
}
