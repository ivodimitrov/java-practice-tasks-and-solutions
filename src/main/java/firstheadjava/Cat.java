package firstheadjava;

public class Cat extends Feline implements Pet {

    /**
     * When we say you must implement the abstract method that means
     * you must provide a body. That means you must create a non-abstract
     * method in your class with the same method signature,
     * name and arguments and a return type that is compatible with
     * the declared return type of the abstract method that you put
     * in that method is up to you. What java cares about is that
     * the method is there in your concrete subclass.
     * <p>
     * Use the keyword “implements” followed by the interface name. Note that
     * when you implement an interface you still get to extend a class.
     */

    @Override
    public void eat() {
        System.out.println("Cat eat. Overridden method.");
    }

    @Override
    public void beFriendly() {
        System.out.println("Cat is friendly.");
    }

    @Override
    public void play() {
        System.out.println("Cat is playing.");
    }
}
