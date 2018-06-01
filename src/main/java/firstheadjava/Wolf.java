package firstheadjava;

public class Wolf extends Canine {

    public static void main(String[] args) {

        Wolf wolf = new Wolf();

        wolf.makeNoise();
        System.out.println();

        wolf.roam();
        System.out.println();

        wolf.eat();
        System.out.println();

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
