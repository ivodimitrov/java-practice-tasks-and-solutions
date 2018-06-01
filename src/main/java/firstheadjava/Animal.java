package firstheadjava;

public class Animal {
// p. 212

    /**
     * WIth polymorphism, you can write code that don't
     * have to change when you introduce new subclass
     * types into the program.
     */
    public static void main(String[] args) {

        Animal[] animals = new Animal[5];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Wolf();
        animals[3] = new Lion();
        animals[4] = new Hippo();


        for (Animal animal : animals) {

            animal.eat();
            animal.roam();
        }
    }

    public void makeNoise() {
        System.out.println("Animal make noise");
    }

    public void eat() {
        System.out.println("Animal eat");
    }

    void sleep() {
        System.out.println("Animal sleep");
    }

    void roam() {
        System.out.println("Animal roam");
    }
}
