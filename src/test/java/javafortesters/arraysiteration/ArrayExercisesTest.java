package javafortesters.arraysiteration;

import javafortesters.domainentities.User;
import org.junit.Test;

import java.util.Arrays;

import static javafortesters.arraysiteration.MultiDimensionalArraysTest.print2DIntArray;
import static javafortesters.helpermethods.GetCurrentExecutableMethodName.printCurrentExecutableMethodName;
import static org.junit.Assert.assertEquals;

public class ArrayExercisesTest {

    @Test
    public void createAnArrayOfUsers() {

        User[] users = new User[3];

        users[0] = new User("bob", "bA55Word");
        users[1] = new User("eris", "eA55Word");
        users[2] = new User("ken", "kA55Word");

        assertEquals("bob", users[0].getUsername());
        assertEquals("eris", users[1].getUsername());
        assertEquals("ken", users[2].getUsername());
    }

    @Test
    public void createAnArrayOfUsersAndIterateOverTheirUserNames() {

        User[] users = new User[3];

        users[0] = new User("bob", "bA55Word");
        users[1] = new User("eris", "eA55Word");
        users[2] = new User("ken", "kA55Word");

        assertEquals("bob", users[0].getUsername());
        assertEquals("eris", users[1].getUsername());
        assertEquals("ken", users[2].getUsername());

        printCurrentExecutableMethodName();

        for (User aUser : users) {
            System.out.println(aUser.getUsername());
        }
    }

    @Test
    public void exerciseCreateAnArrayOf10Users() {

        User[] users = new User[10];

        for (int userIndex = 0; userIndex < 10; userIndex++) {
            int userId = userIndex + 1;
            users[userIndex] = new User("user" + userId,
                    "password" + userId);
        }

        printCurrentExecutableMethodName();

        // check creation
        for (User aUser : users) {
            System.out.println(aUser.getUsername() +
                    ", " +
                    aUser.getPassword());
        }

        // assert creation
        int userId = 1;
        for (User aUser : users) {
            assertEquals("user" + userId, aUser.getUsername());
            assertEquals("password" + userId, aUser.getPassword());
            userId++;
        }

        // check the last one output was 10, i.e. next would be 11
        assertEquals(userId, 11);
    }

    @Test
    public void sortWorkdaysArrayAndAssertResult() {

        String[] workdays = {"Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday"};

        Arrays.sort(workdays);

        assertEquals(workdays[0], "Friday");
        assertEquals(workdays[1], "Monday");
        assertEquals(workdays[2], "Thursday");
        assertEquals(workdays[3], "Tuesday");
        assertEquals(workdays[4], "Wednesday");
    }

    @Test
    public void sortWorkdaysMixedCaseArrayAndAssertResult() {

        String[] workdays = {"monday", "Tuesday", "Wednesday",
                "thursday", "Friday"};

        Arrays.sort(workdays);

        assertEquals(workdays[0], "Friday");
        assertEquals(workdays[1], "Tuesday");
        assertEquals(workdays[2], "Wednesday");
        assertEquals(workdays[3], "monday");
        assertEquals(workdays[4], "thursday");
    }

    @Test
    public void createTriangle2dArray() {

        int[][] triangle = new int[16][];

        for (int row = 0; row < triangle.length; row++) {
            triangle[row] = new int[row + 1];
            for (int i = 0; i < (row + 1); i++) {
                triangle[row][i] = i;
            }
        }

        printCurrentExecutableMethodName();
        print2DIntArray(triangle);
    }
}

