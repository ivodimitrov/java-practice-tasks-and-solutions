package javafortesters.helpermethods;

public class GetCurrentExecutableMethodName {

    // Helper method for getting the name of the current method dynamically
    public static String getMethodName() {
        return Thread.currentThread().getStackTrace()[3].getMethodName();
    }

    public static void printCurrentExecutableMethodName() {
        System.out.println();
        System.out.println("Current executable method: " +getMethodName());
        System.out.println();
    }
}
