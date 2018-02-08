package javafortesters.classesexamples;

import org.junit.Test;

public class ASysOutJunitTest {

    private AClassWithMethods myClass = new AClassWithMethods();

    @Test
    public void canOutputHelloWorldToConsole() {
        myClass.aMethodOnAClass();
    }

    @Test
    public void canOutputSecondMethodToConsole() {
        myClass.aSecondMethodOnAClass();
    }
}
