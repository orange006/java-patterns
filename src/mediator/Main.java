package mediator;

public class Main {
    public static void main(String[] args) {
        User robert = new User("Alexey");
        User john = new User("Oksana");

        robert.sendMessage("Hi! Oksana!");
        john.sendMessage("Hello! Alexey!");
    }
}
