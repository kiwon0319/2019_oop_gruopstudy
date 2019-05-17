import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("플레이어 수를 입력하세요");
        int players = scan.nextInt();

        Playable p[] = new Playable[players];

        for (int i = 0; i < players; i++) {
            System.out.println("플레이어 이름을 입력하세요");
            String playername = scan.nextLine();
            p[i] = new Playable(playername);
            p[i].makeStat();
        }
    }
}