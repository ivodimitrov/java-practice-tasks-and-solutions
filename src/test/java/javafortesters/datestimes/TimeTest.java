package javafortesters.datestimes;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TimeTest {

    @Test
    public void currentTimeMillis() {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 10; i++) {
            System.out.println("Current Time " +
                    System.currentTimeMillis());
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Total Time " + (endTime - startTime));
    }

    @Test
    public void createAUniqueUserID() {

        String userID = "user" + System.currentTimeMillis();

        System.out.println(userID);
        assertTrue(userID.startsWith("user"));
    }
}
