package javaabeginnersguide.practiseinterfaces;

public interface MyIF {
    // This is a static interface method.
    // Static interface methods are not inherited by either an
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

    // A private method cannot be used by code outside the interface
    // in which it is defined. This restriction includes subinterfaces because
    // a private interface method is not inherited by a subinterface.

}
