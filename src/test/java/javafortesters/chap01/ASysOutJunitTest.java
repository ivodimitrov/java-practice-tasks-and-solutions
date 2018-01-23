package javafortesters.chap01;

import org.junit.Test;

public class ASysOutJunitTest {

    private AClassWithAMethod myClass = new AClassWithAMethod();

    @Test
    public void canOutputHelloWorldToConsole() {
        myClass.aMethodOnAClass();
    }

    @Test
    public void canOutputSecondMethodToConsole() {
        myClass.aSecondMethodOnAClass();
    }
}
