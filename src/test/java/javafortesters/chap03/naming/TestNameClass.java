package javafortesters.chap03.naming;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestNameClass {

    @Test
    public void whenClassHasTestAtFrontThenTestIsRun() {
        // this test will run from maven so it needs to pass

        assertTrue("whenClassHasTestAtFrontThenTestIsRun",
                true);

        System.out.println("***** ------------- *****");
        System.out.println("***** TestNameClass *****");
        System.out.println("***** ------------- *****");
    }
}
