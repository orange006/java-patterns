package observer;

public class HexObserver extends Observer {

    public HexObserver(Number number) {
        this.number = number;
        this.number.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hex: " + Integer.toHexString(number.getState()));
    }
}
