package javafortesters.domainobject;

public class TestAppEnv {

    private static final String DOMAIN = "192.123.0.3";
    private static final String PORT = "67";

    public static String getUrl() {
        return "http://" + DOMAIN + ":" + PORT;
    }
}
