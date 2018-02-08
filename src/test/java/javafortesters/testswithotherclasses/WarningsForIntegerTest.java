package javafortesters.testswithotherclasses;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class WarningsForIntegerTest {

    @Test(expected = AssertionError.class)
    public void intEqualsIntVsIntegerEqualsInteger() {

        assertEquals(4, 4);
        assertTrue(4 == 4);

        Integer firstFour = new Integer(4);
        Integer secondFour = 4;

        assertEquals(firstFour, secondFour);
        assertTrue(firstFour == secondFour);
    }

    @Test
    public void integerEqualsIntegerAssertTrue() {

        Integer firstFour = 4;
        Integer secondFour = new Integer(4);

        assertEquals(firstFour, secondFour);
        assertTrue(firstFour.equals(secondFour));
    }
}
