package javaabeginnersguide.practiseinterfaces;

public class DefaultMethodDemo {
    public static void main(String args[]) {

        MyIFImp obj = new MyIFImp();

        // Can call getUserID(), because it is explicitly
        // implemented by MyIFImp:
        System.out.println("User ID is " + obj.getUserID());

        // Can also call getAdminID(), because of default
        // implementation:
        System.out.println("Administrator ID is " + obj.getAdminID());

        // No implementation or instance of MyIF is required to call
        // getUniversalID( ) because it is static.
        int uID = MyIF.getUniversalID();
    }
}
