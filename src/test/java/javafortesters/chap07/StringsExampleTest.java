package javafortesters.chap07;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StringsExampleTest {

    @Test
    public void stringsConcatenated() {

        assertEquals("123456", "12" + "34" + "56");
    }

    @Test
    public void someStringMethods() {
        String aString = "abcdef";

        assertEquals(6, aString.length());
        assertTrue(aString.compareToIgnoreCase("ABCDEF") == 0);
        assertTrue(aString.contains("bcde"));
        assertTrue(aString.startsWith("abcd"));

        assertEquals('c', aString.charAt(2));
        assertEquals("ef", aString.substring(4));
    }
}
