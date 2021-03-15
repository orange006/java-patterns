package template_method;

public class Main {
    public static void main(String[] args) {
        Game game = new Volleyball();
        game.play();

        System.out.println();
        
        game = new Football();
        game.play();
    }
}
