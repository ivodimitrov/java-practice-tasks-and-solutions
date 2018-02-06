package javafortesters.testsWithOtherClasses04;

import org.junit.Test;

public class ASysOutJunitSecondTest {

    private IntegerExercisesTest integerExercisesTestTest = new IntegerExercisesTest();

    @Test
    public void canOutputIntToHex() {
        integerExercisesTestTest.canConvertIntToHex();
    }
}
