import java.util.Scanner;

public class Main {
    public  static void Main(String[] args){
        int players;
        String playerName;

        Scanner scan = new Scanner(System.in);

        System.out.println("플레이어 수를 입력해주세요.");
        players = scan.nextInt();

        Playable playable[] = new Playable[players];

        for(int i = 0; i < players; i++){
            System.out.println("플레이어의 이름을 입력해주세요");
            playerName = scan.nextLine();

            playable[i] = new Playable(playerName);
            playable[i].makeStat();
        }
    }
}
