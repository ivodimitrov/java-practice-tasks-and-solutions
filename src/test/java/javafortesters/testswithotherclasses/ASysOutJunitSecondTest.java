package javafortesters.testswithotherclasses;

import org.junit.Test;

public class ASysOutJunitSecondTest {

    private IntegerExercisesTest integerExercisesTestTest = new IntegerExercisesTest();

    @Test
    public void canOutputIntToHex() {
        integerExercisesTestTest.canConvertIntToHex();
    }
}
