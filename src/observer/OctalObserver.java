package observer;

public class OctalObserver extends Observer {

    public OctalObserver(Number number){
        this.number = number;
        this.number.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Octal: " + Integer.toOctalString(number.getState()));
    }
}
