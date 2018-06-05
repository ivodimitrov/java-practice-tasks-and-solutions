package firstheadjava;

class Duck {

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
        // Use the argument value to set the size instance variable.
        size = duckSize;
    }

    void printDuckSize() {
        System.out.println("Duck size is " + size);
    }
}
