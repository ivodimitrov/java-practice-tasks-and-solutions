package javafortesters.chap02;

import javafortesters.domainentities.Contact;
import javafortesters.domainentities.ContactsManager;

public class FriendsContacts {

    public static void main(String[] args) {

        ContactsManager myContactsManager = new ContactsManager();

        Contact friendJames = new Contact("James",
                "james@email.com", "0012223333");

        myContactsManager.addContact(friendJames);
        // Create a new Contact object for Cezanne
        Contact friendCezanne = new Contact("Cezanne",
                "cezanne@email.com", "987654321");
        // Add Cezanne Contact to the ContactsManager
        myContactsManager.addContact(friendCezanne);
        // Create a new Contact object for Jessica
        Contact friendJessica = new Contact("Jessica", "jessica@email.com", "5554440001");
        // Add Jessica Contact to the ContactsManager
        myContactsManager.addContact(friendJessica);

        // Search of a contact and display their phone number
        Contact result = myContactsManager.searchContact("Jessica");
        System.out.println(result.getPhoneNumber());

        // Display all friends names, emails and phone numbers
        myContactsManager.printContacts();
    }

}
