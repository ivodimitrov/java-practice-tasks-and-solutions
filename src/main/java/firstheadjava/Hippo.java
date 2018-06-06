package firstheadjava;

public class Hippo extends Animal {
    Hippo() {
        // constructor code goes here
    }

    /**
     * The constructor that takes
     *
     * @param theName and assigns it the name instance variable
     */
    Hippo(String theName) {
        super(theName);
    }

    @Override
    public void eat() {
        System.out.println("Hippo eat. Overridden method.");
    }
}
