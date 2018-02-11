package javafortesters.inheritance;

import javafortesters.domainentities.User;

public class ReadOnlyUser extends User {

    @Override
    public String getPermission() {
        return "ReadOnly";
    }
}
