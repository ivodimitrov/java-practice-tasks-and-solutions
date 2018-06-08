package firstheadjava;

import java.awt.*;

public class Hippo extends Animal {
    Color color;

    /**
     * Use this() to call a constructor from another
     * overloaded constructor in the same class.
     * The call to this() can be used only in a
     * constructor, and must be the first statement in
     * a constructor.
     * A constructor can have a call to super() or
     * this(), but never both!
     */
    Hippo() {
        this(Color.BLUE);
    }

    private Hippo(Color color) {
        super("Toshko");
        // more initialization
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
