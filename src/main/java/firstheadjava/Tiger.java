package firstheadjava;

public class Tiger extends Feline {
    private Tiger() {
        super();
    }

    /**
     * The constructor that takes
     *
     * @param theName and assigns it the name instance variable
     */
    Tiger(String theName) {
        super(theName);
    }

    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        tiger.runMethodFromSuperclass();
    }

    @Override
    public void eat() {
        System.out.println("Tiger eat. Overridden method.");
    }

    /**
     * To invoke the superclass version of a method from a subclass that’s overridden the
     * method, use the super keyword.
     */
    private void runMethodFromSuperclass() {
        super.callMethodFromSuperclass();
    }
}
