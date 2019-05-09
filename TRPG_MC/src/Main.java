public class Main {
    public static void main(String[] args) {
        int players = 5;
        String playername[] = {"a", "b", "c", "d", "e"};
        Playable p[] = new Playable[5];

        for (int i = 0; i < players; i++) {
            p[i] = new Playable(playername[i]);
            p[i].makeStat();
        }
    }
}