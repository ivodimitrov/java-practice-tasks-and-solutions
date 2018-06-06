package firstheadjava;

public class Lion extends Feline {
    Lion() {
        // constructor code goes here
    }

    /**
     * The constructor that takes
     *
     * @param theName and assigns it the name instance variable
     */
    Lion(String theName) {
        super(theName);
    }

    @Override
    public void eat() {
        System.out.println("Lion eat. Overridden method.");
    }
}
