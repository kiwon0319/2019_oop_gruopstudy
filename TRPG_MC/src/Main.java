import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int players;
        Scanner scan = new Scanner(System.in);

        players = scan.nextInt();
        // String playername[] = {"a", "b", "c", "d", "e"};
        Playable p[] = new Playable[5];

        for (int i = 0; i < players; i++) {
            String playername;
            playername = scan.nextLine();
            p[i] = new Playable(playername);
            p[i].makeStat();
        }
    }
}