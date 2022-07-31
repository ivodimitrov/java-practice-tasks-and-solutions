package firstheadjava;

class Duck extends Animal {
    private int size;

    /**
     * Duck constructor. Its name is the same as the class name.
     * There is not a return type.
     * To make a Duck when you do not know the size. Default size
     * is set.
     * duckCount will increment each time the Duck constructor runs,
     * because duckCount is static and won't be reset to 0.
     */
    Duck() {
        // The static duckCount variable is initialized only
        // when the class is first loaded
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

    Duck(String duckName, int duckSize) {
        // constructor code goes here
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    void printDuckSize() {
        System.out.println("Duck size is " + size);
    }

    @Override
    public void eat() {
        System.out.println("Duck is eating.");
    }

    // final class (this code here is only for demonstration)
}