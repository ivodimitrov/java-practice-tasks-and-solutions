package javafortesters.chap03.naming;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class NameClass {

    @Test
    public void whenClassNameHasNoTestInItThenItIsNotRun() {
        // this test will not run from maven so i can make
        // a failing test... it fails in the IDE

        assertTrue("whenClassNameHasNoTestInItThenItIsNotRun",
                false);

        System.out.println("***** --------- *****");
        System.out.println("***** NameClass *****");
        System.out.println("***** --------- *****");
    }
}
