package javafortesters.chap01;

import javafortesters.chap04.IntegerExamplesTest;
import org.junit.Test;

public class ASysOutJunitTest {

    private AClassWithAMethod myClass = new AClassWithAMethod();
    private IntegerExamplesTest integerExamplesTest = new IntegerExamplesTest();

    @Test
    public void canOutputHelloWorldToConsole() {
        myClass.aMethodOnAClass();
    }

    @Test
    public void canOutputSecondMethodToConsole() {
        myClass.aSecondMethodOnAClass();
    }

    @Test
    public void canOutputIntToHex() {
        integerExamplesTest.canConvertIntToHex();
    }
}
