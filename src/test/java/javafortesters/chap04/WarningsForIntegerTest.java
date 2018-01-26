package javafortesters.chap04;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class WarningsForIntegerTest {

    @Test(expected = AssertionError.class)
    public void intEqualsIntVsIntegerEqualsInteger() {

        assertEquals(4, 4);
        assertTrue(4 == 4);

        Integer firstFour = new Integer(4);
        Integer secondFour = new Integer(4);

        assertEquals(firstFour, secondFour);
        assertTrue(firstFour == secondFour);
    }
}
