import java.util.Scanner;

public class Main {

    static Playable playable[];

    public  static void main(String[] args){
        newGame();
        saveGame();
    }

    public static void newGame(){
        int players;
        String playerName;

        Scanner scan = new Scanner(System.in);

        System.out.println("플레이어 수를 입력해주세요.");
        players = scan.nextInt();

        playable = new Playable[players];

        for(int i = 0; i < players; i++){
            Scanner scan2 = new Scanner(System.in);
            System.out.println("플레이어의 이름을 입력해주세요");
            playerName = scan2.nextLine();

            playable[i] = new Playable(playerName);
            playable[i].makeStat();
        }
    }

    public static void saveGame(){
        //캐릭터정보 저장
        Playable.saveStat(playable);
    }

    public void loadGame(){

    }
}
