package javafortesters.arraysiteration;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ArrayExercisesTest {

    private void printSomeStars() {
        System.out.println();
        System.out.println("*********");
    }

    @Test
    public void simpleArrayExample() {

        String[] numbers0123 = {"zero", "one", "two", "three"};

        printSomeStars();

        for (String numberText : numbers0123) {
            System.out.println(numberText);
        }

        assertEquals("zero", numbers0123[0]);
        assertEquals("one", numbers0123[1]);
    }

    @Test
    public void simpleCollectionExample() {

        String[] numbers0123Array = {"zero", "one", "two", "three"};
        List<String> numbers0123 = Arrays.asList(numbers0123Array);

        printSomeStars();

        for (String numberText : numbers0123) {
            System.out.println(numberText);
        }

        assertEquals("zero", numbers0123.get(0));
        assertEquals("one", numbers0123.get(1));
        assertEquals("two", numbers0123.get(2));
        assertEquals("three", numbers0123.get(3));
    }

    @Test
    public void simpleDynamicCollectionExample() {

        List<String> numbers0123 = new ArrayList<String>();

        numbers0123.add("zero");
        numbers0123.add("one");
        numbers0123.add("two");
        numbers0123.add("three");

        printSomeStars();

        for (String numberText : numbers0123) {
            System.out.println(numberText);
        }

        assertEquals("zero", numbers0123.get(0));
        assertEquals("one", numbers0123.get(1));
        assertEquals("two", numbers0123.get(2));
        assertEquals("three", numbers0123.get(3));
    }
}

