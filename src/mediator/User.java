package mediator;

public class User {
    private final String name;

    public String getName() {
        return name;
    }

    public User(String name){
        this.name  = name;
    }

    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);
    }
}
