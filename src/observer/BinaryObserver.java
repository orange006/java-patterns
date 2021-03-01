package observer;

public class BinaryObserver extends Observer {

    public BinaryObserver(Number number) {
        this.number = number;
        this.number.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary: " + Integer.toBinaryString(number.getState()));
    }
}
