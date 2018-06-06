package firstheadjava;

class Duck extends Animal {

    private int size;

    /**
     * Duck constructor. It's name is the same as the class name.
     * There is not a return type.
     * To make a Duck when you do not know the size. Default size
     * is set.
     */
    Duck() {
        // Default size
        size = 22;
    }

    /**
     * If you have more than one constructor in a class,
     * it means you have overloaded constructors.
     * <p>
     * If you write a constructor that takes arguments, and you still
     * want a no-arg constructor, you'll have to build the no-arg
     * constructor yourself!
     * <p>
     * If you have more than one constructor In a class, the
     * constructors MUST have different argument lists.
     *
     * @param duckSize to make a Duck when you know the size.
     */
    Duck(int duckSize) {
        // super() calls the super constructor.
        // The call to super() must be the first statement in each constructor
        super();
        // Use the argument value to set the size instance variable.
        size = duckSize;
    }

    /**
     * Overloaded constructors means you have more than one constructor in your class.
     * To compile, each constructor must have a different argument list.
     */
    Duck(String duckName) {
        super();
        // constructor code goes here
    }

    Duck(int duckSize, String duckName) {
        super();
        // constructor code goes here
    }

    Duck(String duckName, int duckSize) {
        // constructor code goes here
    }

    void printDuckSize() {
        System.out.println("Duck size is " + size);
    }

    @Override
    public void eat() {
        System.out.println("Duck is eating.");
    }
}
