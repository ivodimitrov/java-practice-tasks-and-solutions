package firstheadjava;

public class UsaADuck {

    public static void main(String[] args) {

        Duck firstDuck = new Duck();

        //Pass the duck size to the constructor.
        Duck secondDuck = new Duck(33);

        firstDuck.printDuckSize();

        System.out.println("-----------------");

        secondDuck.printDuckSize();
    }
}
