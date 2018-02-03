package javafortesters.chap02;

import javafortesters.domainentities.Contact;
import javafortesters.domainentities.ContactsManager;

public class FriendsContacts {

    public static void main(String[] args) {

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

        // Search of a contact and display their phone number
        Contact result = myContactsManager.searchContact("Jessica");
        System.out.println(result.getPhoneNumber());

        // Display all friends names, emails and phone numbers
        myContactsManager.printContacts();
    }

}
