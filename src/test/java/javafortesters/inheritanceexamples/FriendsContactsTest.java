package javafortesters.inheritanceexamples;

import javafortesters.domainentities.Contact;
import javafortesters.domainentities.ContactsManager;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FriendsContactsTest {

    @Test
    public void contactsHasBeenAdded() {

        ContactsManager myContactsManager = new ContactsManager();

        Contact friendJames = new Contact("James",
                "james@email.com", "0012223333");

        myContactsManager.addContact(friendJames);

        Contact friendCezanne = new Contact("Cezanne",
                "cezanne@email.com", "987654321");

        myContactsManager.addContact(friendCezanne);

        Contact friendJessica = new Contact("Jessica",
                "jessica@email.com", "5554440001");

        myContactsManager.addContact(friendJessica);

        assertEquals("Verify contacts counter", 3,
                myContactsManager.getFriendsCount());

        // Search of a contact and their phone number
        Contact result = myContactsManager.searchContact("Jessica");

        assertEquals("Expected Jessica", "Jessica",
                result.getName());

        assertEquals("Expected phone number: 5554440001", "5554440001",
                result.getPhoneNumber());

        assertTrue("At index 2 expected Jessica",
                myContactsManager.searchContactAtIndex(2, "Jessica"));

        assertEquals("Expected Jessica at index 2 expected ", "Jessica",
                myContactsManager.contactAtIndex(2));

        // Display all friends names, emails and phone numbers
        myContactsManager.printContacts();
    }
}
