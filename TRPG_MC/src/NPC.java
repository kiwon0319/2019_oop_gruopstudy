import java.util.Scanner;

public class NPC extends Players{
    Scanner scan = new Scanner(System.in);

    public NPC(String _name){
        this.name = _name;
    }

    @Override
    void makeStat() {

        System.out.println("str 입력");
        str = scan.nextInt();
        System.out.println("con 입력");
        con = scan.nextInt();
        System.out.println("siz 입력");
        siz = scan.nextInt();
        System.out.println("intel 입력");
        intel = scan.nextInt();
        System.out.println("pow 입력");
        pow = scan.nextInt();
        System.out.println("dex 입력");
        dex = scan.nextInt();
        System.out.println("app 입력");
        app = scan.nextInt();
        System.out.println("edu 입력");
        edu = scan.nextInt();

        idea = intel * 5;
        luck = pow * 5;
        know = edu * 5;

        if(idea > 99){
            idea = 99;
        }
        if(luck > 99){
            luck = 99;
        }
        if(know > 99){
            know = 99;
        }

        db = siz + str;

        maxHp = (con + siz) / 2;
        hp = maxHp;
        maxMp = pow * 5;
        mp = maxMp;

        sanMax = pow * 5;
        if(sanMax > 99 - cp){
            sanMax = 99 - cp;
        }
        san = sanMax;
    }
}
