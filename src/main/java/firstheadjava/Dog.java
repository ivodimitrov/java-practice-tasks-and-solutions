package firstheadjava;

public class Dog extends Canine implements Pet, Saveable, Paintable {

    /**
     * A class can implement multiple interfaces!
     * A java class can have only one parent superclass and that parent
     * Class defines who you are. But you can implement multiple
     * Interfaces and those interfaces define roles you can play.
     * <p>
     * Make a class that doesn't extend anything
     * (other than Object) when your new class doesn't
     * pass the IS-A test for any other type.
     * <p>
     * Make a subclass (in other words, extend a class)
     * only when you need to make a more specific
     * version of a class and need to override or add
     * new behaviors.
     * <p>
     * Use an abstract class when you want to define
     * a template for a group of subclasses, and you
     * have at least some implementation code that all
     * subclasses could use. Make the class abstract
     * when you want to guarantee that nobody can
     * make objects of that type.
     * <p>
     * Use an interface when you want to define a role
     * that other classes can play, regardless of where
     * those classes are in the inheritance tree.
     */

    // Instance variables (state). Things an object knows itself.
    int size;
    String name;

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Evstati";
        dog1.bark(1);
        System.out.println();

        Dog[] myDogs = new Dog[3];
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

        myDogs[0].name = "Balkancho";
        myDogs[1].name = "Pirin";

        System.out.println("Last dog name is: " + myDogs[2].name + ".");
        System.out.println();

        int x = 0;
        while (x < myDogs.length) {
            myDogs[x].bark(2);
            x++;
        }

        dog1.go();

        dog1.beFriendly();
        dog1.play();
        dog1.chaseCat();
    }

    // A method (behavior). Things an object do.
    void bark(int numOfBarks) {
        while (numOfBarks > 0) {
            if (size > 60) {
                System.out.println(name + " says Woof!");
            } else if (size > 14) {
                System.out.println(name + " says Ruff!");
            } else {
                System.out.println(name + " says Yip!");
            }
            numOfBarks--;
        }
    }

    private void chaseCat() {
        System.out.println("Dog is chasing a cat");
    }

    @Override
    public void beFriendly() {
        System.out.println("Dog is friendly.");
    }

    @Override
    public void play() {
        System.out.println("Dog is playing.");
    }
}
