package firstheadjava;

public interface Pet {

    /**
     * Java interface solves your multiple inheritance problem
     * by giving you much of the polymorphic benefits of multiple
     * inheritance without the pain and suffering from the deadly
     * diamond of death.
     * <p>
     * A Java interface is like a 100% pure abstract class.
     * <p>
     * All methods in an interface are abstract, so any class that IS-A
     * Pet MUST implement (i.e. override) the methods of Pet.
     */

    void beFriendly();

    void play();
}
