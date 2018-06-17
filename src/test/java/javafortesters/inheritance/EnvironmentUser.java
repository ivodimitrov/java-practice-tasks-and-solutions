package javafortesters.inheritance;

import javafortesters.domainentities.User;
import javafortesters.domainobject.TestAppEnv;

class EnvironmentUser extends User {

    String getUrl() {
        return TestAppEnv.getUrl();
    }
}
