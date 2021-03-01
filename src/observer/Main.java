package observer;

public class Main {
    public static void main(String[] args) {
        Number number = new Number();

        new HexObserver(number);
        new OctalObserver(number);
        new BinaryObserver(number);

        System.out.println("First state:");

        number.setState(228);

        System.out.println("\nSecond state:");

        number.setState(13);
    }
}
