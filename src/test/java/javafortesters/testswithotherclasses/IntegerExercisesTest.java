package javafortesters.testswithotherclasses;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerExercisesTest {

    @Test
    public void canConvertIntToHex() {
        int firstIntToConvert = 11;
        assertEquals("hex 11 is b", "b",
                Integer.toHexString(firstIntToConvert));
        System.out.println(Integer.toHexString(firstIntToConvert));

        int secondIntToConvert = 10;
        assertEquals("hex 10 is a", "a", Integer.toHexString(secondIntToConvert));
        System.out.println(Integer.toHexString(secondIntToConvert));

        int thirdIntToConvert = 3;
        assertEquals("hex 3 is 3", "3", Integer.toHexString(thirdIntToConvert));
        System.out.println(Integer.toHexString(thirdIntToConvert));

    }

    @Test
    public void canConfirmIntMinAndMaxLimits() {

        int minimumInt = -2147483648;
        int maximumInt = 2147483647;

        assertEquals("integer min", minimumInt, Integer.MIN_VALUE);
        assertEquals("integer max", maximumInt, Integer.MAX_VALUE);
    }
}
