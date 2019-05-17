import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int players = 5;

        System.out.println("플레이어 인원수를 입력하세요. \n>> ");
        players = scan.nextInt();
        Playable p[] = new Playable[players];

        System.out.println("캐릭터 이름들을 입력하세요.");

        for (int i = 0; i < players; i++) {
            System.out.println( i + "번쨰 캐릭터 이름 >> ");
            String playername = scan.nextLine();
            p[i] = new Playable(playername);
            p[i].makeStat();
        }
    }
}