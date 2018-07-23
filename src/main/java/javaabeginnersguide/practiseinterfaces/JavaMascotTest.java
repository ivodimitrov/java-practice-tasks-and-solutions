package javaabeginnersguide.practiseinterfaces;

public class JavaMascotTest {
    public static void main(String[] args) {
        JavaMascot dukeMascot = new Duke();
        dukeMascot.executeAction();
        JavaMascot juggyMascot = new Juggy();
        juggyMascot.executeAction();
    }
}
