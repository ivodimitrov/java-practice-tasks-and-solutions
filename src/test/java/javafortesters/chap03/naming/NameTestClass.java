package javafortesters.chap03.naming;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class NameTestClass {

    @Test
    public void whenClassHasTestInMiddleThenTestIsNotRun() {
        // this test will not run from maven so i can make
        // a failing test... it fails in the IDE

        assertTrue("whenClassHasTestInMiddleThenTestIsNotRun",
                false);

        System.out.println("***** ------------- *****");
        System.out.println("***** NameTestClass *****");
        System.out.println("***** ------------- *****");
    }
}
