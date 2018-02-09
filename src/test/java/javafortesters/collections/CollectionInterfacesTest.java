package javafortesters.collections;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

import static org.junit.Assert.assertEquals;

public class CollectionInterfacesTest {

    @Test
    public void collectionDeclarationAndInitializationExplored() {

        Collection<String> cola = new ArrayList<String>();
        Collection<String> colb = new ArrayList<String>();
        Collection<String> colc = new ArrayList<String>();

    }

    @Test
    public void hashSetDoesNotAllowDupes() {

        Collection workdays = new HashSet();

        workdays.add("Monday");
        workdays.add("Monday");
        workdays.add("Monday");
        workdays.add("Monday");
        workdays.add("Monday");

        assertEquals(1, workdays.size());
    }

    @Test
    public void arrayListDoesAllowDupes() {

        Collection workdays = new ArrayList();

        workdays.add("Monday");
        workdays.add("Monday");
        workdays.add("Monday");
        workdays.add("Monday");
        workdays.add("Monday");

        assertEquals(5, workdays.size());
    }
}
