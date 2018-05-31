package firstheadjava;

public class Dog extends Canine {

    // instance variables (state). Things an object knows itself.
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
    }

    // a method (behavior). Things an object do.
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

    void chaseCat() {
    }
}
