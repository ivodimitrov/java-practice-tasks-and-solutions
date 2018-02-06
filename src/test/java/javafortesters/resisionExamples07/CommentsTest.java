package javafortesters.resisionExamples07;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CommentsTest {

    @Test
    public void anEndOfLineComment() {
        boolean truthy = true;

        assertTrue(truthy); // commert till end of line
    }

    @Test
    public void aBlockComment() {

        /*
          This code checks that the true
          value that truthy was set to
          is true. Pretty obvious really.
         */

        boolean truthy = true;
        assertTrue(truthy);
    }

    @Test
    public void aJavaDocComment() {

        assertTrue(addTwoNumbers(4, 3) == 7);

    }

    /**
     * Add two integers and return an int.
     * <p>
     * There is a risk of overflow since two big
     * integers would max out the return int.
     *
     * @param a is the first number to add
     * @param b is the second number to add
     * @return a+b as an int
     */

    private int addTwoNumbers(int a, int b) {
        return a + b;
    }
}
