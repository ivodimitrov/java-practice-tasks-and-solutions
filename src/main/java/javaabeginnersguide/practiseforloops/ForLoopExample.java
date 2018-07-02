package javaabeginnersguide.practiseforloops;

import java.io.IOException;

public class ForLoopExample {
    /*
    The condition controlling the loop can be any valid Boolean expression. It does
    not need to involve the loop control variable. In the next example, the loop continues
    to execute until the user types the letter S at the keyboard:
     */

    public static void main(String[] args) throws IOException {

        int i;

        System.out.println("Press S to stop.");

        for (i = 0; (char) System.in.read() != 'S'; i++) {
            System.out.println("Pass #" + i);

        }
    }
}
