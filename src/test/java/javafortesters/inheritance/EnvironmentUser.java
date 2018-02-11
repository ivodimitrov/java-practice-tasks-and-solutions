package javafortesters.inheritance;

import javafortesters.domainentities.User;
import javafortesters.domainobject.TestAppEnv;

public class EnvironmentUser extends User {

    public String getUrl() {
        return TestAppEnv.getUrl();
    }
}
