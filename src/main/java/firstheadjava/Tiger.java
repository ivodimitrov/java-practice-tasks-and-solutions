package firstheadjava;

public class Tiger extends Feline {

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
