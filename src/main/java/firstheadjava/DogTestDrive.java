package firstheadjava;

public class DogTestDrive {

    public static void main(String[] args) {
        // make a Dog object
        Dog dog = new Dog();

        //access the object's variables and methods
        dog.name = "Toshko";
        dog.size = 40;
        dog.bark(1);

        System.out.println("<----------!!!!!!!!!!---------->");

        Dog[] myDogs = new Dog[3];
        myDogs[0] = new Dog();
        myDogs[0].name = "Stamat";
        myDogs[0].bark(2);

        System.out.println("<----------!!!!!!!!!!---------->");


        Dog one = new Dog();
        one.name = "Goshko";
        one.size = 80;

        Dog two = new Dog();
        two.name = "Choki";
        two.size = 8;

        Dog three = new Dog();
        three.name = "Peshko";
        three.size = 35;

        one.bark(3);

        two.bark(4);

        three.bark(5);
    }
}
