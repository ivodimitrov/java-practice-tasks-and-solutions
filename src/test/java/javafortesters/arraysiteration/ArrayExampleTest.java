package javafortesters.arraysiteration;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ArrayExampleTest {

    String[] workdays = {"Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday"};

    @Test
    public void simpleArrayExample() {
        String[] numbers0123 = {"zero", "one", "two", "three"};

        for (String numberText : numbers0123) {
            System.out.println(numberText);
        }

        assertEquals("zero", numbers0123[0]);
        assertEquals("one", numbers0123[1]);
    }

    @Test
    public void arrayInitialization() {

        String[] strings;

        int[] uninitializedArray;

        uninitializedArray = new int[]{100, 200, 300};

        strings = new String[]{"mr", "mrs", "sir", "lord", "madam"};

        assertEquals(100, uninitializedArray[0]);
        assertEquals("mr", strings[0]);
    }

    @Test
    public void forEachLoop() {
        StringBuilder days = new StringBuilder();

        for (String workday : workdays) {
            days.append("|").append(workday);
        }

        assertEquals("|Monday|Tuesday|Wednesday|Thursday|Friday", days.toString());
    }

    @Test
    public void forLoopWithFixedCondition() {
        StringBuilder days = new StringBuilder();

        for (int i = 0; i < 5; i++) {
            days.append("|").append(workdays[i]);
        }

        assertEquals("|Monday|Tuesday|Wednesday|Thursday|Friday", days.toString());
    }

    @Test
    public void forLoopUsingIndexFixedCondition() {
        StringBuilder days = new StringBuilder();

        for (int i = 0; i < 5; i++) {
            days.append("|").append(i).append("-").append(workdays[i]);
        }

        assertEquals(
                "|0-Monday|1-Tuesday|2-Wednesday|3-Thursday|4-Friday",
                days.toString());
    }

    @Test
    public void forLoopMissingInitialization() {
        StringBuilder days = new StringBuilder();

        int i = 0;
        for (; i < 5; i++) {
            days.append("|").append(workdays[i]);
        }
        assertEquals("|Monday|Tuesday|Wednesday|Thursday|Friday", days.toString());
    }

    @Test
    public void forLoopMissingIterator() {
        StringBuilder days = new StringBuilder();

        int i = 0;
        while (i < 5) {
            days.append("|").append(workdays[i]);
            i++;
        }
        assertEquals("|Monday|Tuesday|Wednesday|Thursday|Friday", days.toString());
    }

    @Test
    public void forLoopMissingEverything() {
        StringBuilder days = new StringBuilder();
        int i = 0;
        do {
            days.append("|").append(workdays[i]);
            i++;
        } while (i < 5);
        assertEquals("|Monday|Tuesday|Wednesday|Thursday|Friday", days.toString());
    }

    @Test
    public void forEachWithIndex() {
        StringBuilder days = new StringBuilder();
        int dayIndex = 0;
        for (String workday : workdays) {
            days.append("|").append(Arrays.toString(workdays));

            System.out.println("Found " + workday +
                    " at position " + dayIndex);
            dayIndex++;
        }
    }

    @Test
    public void accessValuesArray() {

        assertEquals("Monday", workdays[0]);
        assertEquals("Friday", workdays[4]);
    }

    @Test
    public void arraySize() {

        assertEquals(5, workdays.length);
    }

    @Test
    public void arraySizeInForLoop() {
        StringBuilder days = new StringBuilder();

        for (String workday : workdays) {
            days.append("|").append(workday);
        }

        assertEquals("|Monday|Tuesday|Wednesday|Thursday|Friday", days.toString());
    }
}
