package javafortesters.domainentities;

public class ContactsManager {

    // Fields:
    Contact[] myFriends;
    int friendsCount;

    // Constructor:
    ContactsManager() {
        friendsCount = 0;
        myFriends = new Contact[500];
    }

    // Methods:
    void addContact(Contact contact) {
        myFriends[friendsCount] = contact;
        friendsCount++;
    }

    Contact searchContact(String searchName) {
        for (int i = 0; i < friendsCount; i++) {
            if (myFriends[i].name.equals(searchName)) {
                return myFriends[i];
            }
        }
        return null;
    }

    public void printContacts() {
        for (int i = 0; i < friendsCount; i++) {
            System.out.println("Name: " + myFriends[i].name +
                    ", Email: " + myFriends[i].email + ", Phone Number: "
                    + myFriends[i].phoneNumber);
        }
    }

}
