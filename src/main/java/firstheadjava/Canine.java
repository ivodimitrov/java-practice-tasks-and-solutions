package firstheadjava;

public class Canine extends Animal {

    /**
     * When you override a method from a superclass, you're agreeing to
     * fulfill the contract. The contract that says. for example, take no
     * arguments and I return a boolean." In other words, the arguments
     * and return types of your overriding method must look to the outside
     * world exactly like the overridden method in the superclass.
     */

    @Override
    public void eat() {

        System.out.println("Canine eat. Overridden method.");
    }
}
