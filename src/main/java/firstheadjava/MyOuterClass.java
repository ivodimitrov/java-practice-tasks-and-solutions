package firstheadjava;

public class MyOuterClass {

    private int x;

    private MyInnerClass myInnerClass = new MyInnerClass();

    public void doStuff() {
        myInnerClass.go();
    }

    class MyInnerClass {

        void go() {
            x = 42;
        }
    }
}
