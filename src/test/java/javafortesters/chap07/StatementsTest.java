package javafortesters.chap07;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StatementsTest {

    @Test
    public void StatementsTest() {

        assertEquals(4, 2 + 2);

        assertEquals("2 + 2 always = 4",
                4,
                2 + 2);
    }

}
