package javafortesters.collections;

import javafortesters.domainentities.User;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;

public class CollectionsExercisesTest {

    @Test
    public void useAForLoopInsteadOfAWhile() {

        String[] someDays = {"Tuesday", "Thursday",
                "Wednesday", "Monday",
                "Saturday", "Sunday",
                "Friday"};

        List<String> days = Arrays.asList(someDays);

        int forwhile;
        for (forwhile = 0; !days.get(forwhile).equals("Monday"); forwhile++) {
        }
        assertEquals("Monday is at position 3", 3, forwhile);
    }


    @Test
    public void createAndManipulateACollectionOfUsers() {

        Collection<User> someUsers = new ArrayList<User>();

        User bob = new User("bob", "Passw0rd");
        User eris = new User("eris", "Cha0sTime");

        assertEquals(0, someUsers.size());
        assertTrue(someUsers.isEmpty());

        someUsers.add(bob);
        someUsers.add(eris);

        assertEquals(2, someUsers.size());
        assertFalse(someUsers.isEmpty());

        Collection<User> secondUsers = new ArrayList<User>();

        User robert = new User("robert", "9assword");
        User aleister = new User("aleister", "Pass5word");

        secondUsers.add(robert);
        secondUsers.add(aleister);

        assertEquals(2, secondUsers.size());

        someUsers.addAll(secondUsers);

        assertEquals(4, someUsers.size());
        assertTrue(someUsers.containsAll(someUsers));
        assertTrue(someUsers.contains(aleister));

        secondUsers.removeAll(someUsers);

        assertEquals(0, secondUsers.size());

        someUsers.clear();

        assertEquals(0, someUsers.size());
    }
}
