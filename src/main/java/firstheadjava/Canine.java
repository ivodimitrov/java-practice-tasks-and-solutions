package firstheadjava;

abstract class Canine extends Animal {

    /**
     * When you override a method from a superclass, you're agreeing to
     * fulfill the contract. The contract that says. for example, take no
     * arguments and I return a boolean." In other words, the arguments
     * and return types of your overriding method must look to the outside
     * world exactly like the overridden method in the superclass.
     * <p>
     * An abstract class means that nobody can ever make a new instance of
     * that class. You can still use that abstract class as a declared
     * reference type for the purpose of polymorphism but you don't have
     * to worry about somebody making objects of that type
     */

    @Override
    public void eat() {

        System.out.println("Canine eat. Overridden method.");
    }

    @Override
    public void roam() {

        System.out.println("Canine roam. Overridden method.");
    }

    /**
     * This is OK, because you can always assign a subclass object to a
     * superclass reference, even if the superclass is abstract.
     */
    void go() {
        Canine canine = new Dog();
        System.out.println("<----------!!!!!!!!!!---------->");
        canine.eat();
        canine.roam();
        System.out.println("<----------!!!!!!!!!!---------->");
    }
}
