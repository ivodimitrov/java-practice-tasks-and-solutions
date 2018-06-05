package firstheadjava;

public class PetOwner {

    /**
     * You can have polymorphic arguments and return types.
     * The Vet's giveShot() method can take any Animal you
     * give it. As long as the object you pass in as the
     * argument is a subclass of Animal, it will work.
     */

    public void start() {

        Vet vet = new Vet();

        Dog dog = new Dog();

        Hippo hippo = new Hippo();

        vet.giveShot(dog);

        vet.giveShot(hippo);
    }
}
