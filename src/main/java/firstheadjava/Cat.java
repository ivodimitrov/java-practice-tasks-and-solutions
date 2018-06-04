package firstheadjava;

public class Cat extends Feline {

    /**
     * When we say you must implement the abstract method that means
     * you must provide a body. That means you must create a non
     * abstract method in your class with the same method signature,
     * name and arguments and a return type that is compatible with
     * the declared return type of the abstract method that you put
     * in that method is up to you. What java cares about is that
     * the method is there in your concrete subclass.
     */

    @Override
    public void eat() {

        System.out.println("Cat eat. Overridden method.");
    }
}
