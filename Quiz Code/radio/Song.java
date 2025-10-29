package radio;

public class Song {
    public void playMusic() {
        System.out.print("Play!");
    }

    private static int playMusic() {
        System.out.println("Music!");
    }

    public static void main(String[] tracks) {
        new Song().playMusic();
    }
}
