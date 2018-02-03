package javafortesters.domainentities;

public class ContactsManager {

    // Fields:
    private Contact[] myFriends;
    private int friendsCount;

    // Constructor:
    ContactsManager() {
        friendsCount = 0;
        myFriends = new Contact[500];
    }

    // Methods:
    public void addContact(Contact contact) {
        myFriends[friendsCount] = contact;
        friendsCount++;
    }

    Contact searchContact(String searchName) {
        for (int i = 0; i < friendsCount; i++) {
            if (myFriends[i].getName().equals(searchName)) {
                return myFriends[i];
            }
        }
        return null;
    }

    public void printContacts() {
        for (int i = 0; i < friendsCount; i++) {
            System.out.println("Name: " + myFriends[i].getName() +
                    ", Email: " + myFriends[i].getEmail() +
                    ", Phone Number: " + myFriends[i].getPhoneNumber());
        }
    }

}
