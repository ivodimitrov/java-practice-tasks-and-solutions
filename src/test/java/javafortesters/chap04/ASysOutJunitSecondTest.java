package javafortesters.chap04;

import org.junit.Test;

public class ASysOutJunitSecondTest {

    private IntegerExamplesTest integerExamplesTest = new IntegerExamplesTest();

    @Test
    public void canOutputIntToHex() {
        integerExamplesTest.canConvertIntToHex();
    }
}
