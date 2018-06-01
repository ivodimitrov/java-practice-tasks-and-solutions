package firstheadjava;

public class Overloads {

    /**
     * Method overloading is nothing more than having
     * two methods with the same name but different
     * argument lists. Period. There's no polymorphism
     * involved with overloaded methods!
     */

    private String uniqueID;

    public int addNums(int a, int b) {
        return a + b;
    }

    public double addNums(double a, double b) {
        return a + b;
    }

    private void setUniqueID(String theID) {
        // lots of validation code, and then:
        uniqueID = theID;
    }

    public void setUniqueID(int ssNumber) {
        String numString = "" + ssNumber;
        setUniqueID(numString);
    }


}
