package javaabeginnersguide.practiceexceptions;

public class ExcDemo {
    public static void main(String args[]) {
        int numer[] = {4, 8, 16, 32, 64, 128};
        int denom[] = {0, 2, 0, 4, 0, 8};

        for (int i = 0; i < numer.length; i++) {
            try {
                System.out.println(numer[i] + " / " +
                        denom[i] + " is " +
                        numer[i] / denom[i]);
            }
            // Handle error gracefully and continue.
            catch (ArithmeticException exc) {
                // catch the exception
                System.out.println("Can't divide by Zero!");
            }
        }
    }
}
