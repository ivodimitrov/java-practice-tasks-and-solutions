package javaabeginnersguide.practicedebugging;

public class DebugDemo {

    public static void main(String[] args) {
        // Loop numbers from 1 to 100
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.println("Fifteen");
            } else if (i % 3 == 0) {
                System.out.println("Three");
            } else if (i % 5 == 0) {
                System.out.println("Five");
            } else {
                System.out.println(i);
            }
        }
    }
}
