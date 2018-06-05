package firstheadjava;

class Vet {

    /**
     * You can have polymorphic arguments and return types.
     *
     * @param animal can take any Animal type as the argument.
     *               <p>
     *               When the Vet is done giving the shot, it tells the Animal
     *               to makeNoise(), and whatever Animal is really out there on
     *               the heap, that's whose makeNoise() method will run
     */

    void giveShot(Animal animal) {
        // do horrible things to the Animal at
        //the other end of the "animal" parameter
        animal.makeNoise();
    }
}
