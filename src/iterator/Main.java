package iterator;

public class Main {
    public static void main(String[] args) {
        InstagramNickname instagramNickname = new InstagramNickname();

        for(Iterator it = instagramNickname.getIterator(); it.hasNext();) {
            String name = (String) it.next();
            System.out.println("Nickname: " + name);
        }
    }
}
