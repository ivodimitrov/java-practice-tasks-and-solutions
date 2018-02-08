package javafortesters.firsttestsexamples.naming;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class NameClassTest {

    @Test
    public void whenClassHasTestAtEndThenTestIsRun() {
        // this test will run from maven so it needs to pass

        assertTrue("whenClassHasTestAtEndThenTestIsRun",
                true);

        System.out.println("***** ------------- *****");
        System.out.println("***** NameClassTest *****");
        System.out.println("***** ------------- *****");
    }
}
