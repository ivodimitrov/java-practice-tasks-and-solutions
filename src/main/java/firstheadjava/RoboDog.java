package firstheadjava;

public class RoboDog extends Robot implements Pet {

    /**
     * Classes from different inheritance trees
     * can implement the same interface.
     * <p>
     * Class RoboDog doesn’t come from the Animal
     * inheritance tree, but it still gets to be a Pet!
     */

    @Override
    public void beFriendly() {
        System.out.println("RoboDog is friendly.");
    }

    @Override
    public void play() {
        System.out.println("Dog is playing.");
    }
}
