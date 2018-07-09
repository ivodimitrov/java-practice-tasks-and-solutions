package javaabeginnersguide.practiseinterfaces;

public interface MyIF {
    // This is a static interface method.
    // static interface methods are not inherited by either an
    // implementing class or a subinterface.
    static int getUniversalID() {
        return 0;
    }

    // This is a "normal" interface method declaration.
    // It does NOT define a default implementation.
    int getUserID();

    // This is a default method. Notice that it provides
    // a default implementation.
    default int getAdminID() {
        return 1;
    }
}
