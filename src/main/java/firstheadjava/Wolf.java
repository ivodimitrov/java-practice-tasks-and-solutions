package firstheadjava;

public class Wolf extends Canine {

    /**
     * Inheritance lets you guarantee that all classes grouped under a certain
     * supertype have all the methods that the supertype has.
     * When you call a method on an object reference, you're calling the most specific
     * version of the method for that object type.
     * In other words, the lowest one wins!
     * "Lowest" meaning lowest on the inheritance tree. Canine is lower than
     * Animal, and Wolf is lower than Canine, so invoking a method on a reference
     * to a Wolf object means theJVM starts looking first in the Wolf class. If theJVM
     * doesn't find a version of the method in the Wolf class, it starts walking back up
     * the inheritance hierarchy until it finds a match.
     */

    public static void main(String[] args) {

        Wolf wolf = new Wolf();

        wolf.makeNoise();

        System.out.println("<----------!!!!!!!!!!---------->");

        wolf.roam();

        System.out.println("<----------!!!!!!!!!!---------->");

        wolf.eat();

        System.out.println("<----------!!!!!!!!!!---------->");

        wolf.sleep();
    }

    @Override
    public void makeNoise() {
        System.out.println("Wolf make noise. Overridden method.");
    }

    @Override
    public void eat() {
        System.out.println("Wolf eat. Overridden method.");
    }
}
