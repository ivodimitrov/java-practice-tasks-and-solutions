package javafortesters.domainentities;

public class ContactsManager {


    // Fields:
    private Contact[] myFriends;

    private int friendsCount;

    // Constructors:
    public ContactsManager() {
        friendsCount = 0;
        myFriends = new Contact[500];
    }

    public int getFriendsCount() {
        return friendsCount;
    }

    // Methods:
    public void addContact(Contact contact) {
        myFriends[friendsCount] = contact;
        friendsCount++;
    }

    public Contact searchContact(String searchName) {
        for (int i = 0; i < friendsCount; i++) {
            if (myFriends[i].getName().equals(searchName)) {
                return myFriends[i];
            }
        }
        return null;
    }

    public boolean searchContactAtIndex(int index, String searchName) {
        return myFriends[index].getName().equals(searchName);
    }

    public String contactAtIndex(int index) {
        return myFriends[index].getName();
    }

    public void printContacts() {
        for (int i = 0; i < friendsCount; i++) {
            System.out.println("Name: " + myFriends[i].getName() +
                    ", Email: " + myFriends[i].getEmail() +
                    ", Phone Number: " + myFriends[i].getPhoneNumber());
        }
    }
}
