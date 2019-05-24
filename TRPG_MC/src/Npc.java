import java.util.Scanner;

public class Npc extends Players {
    Scanner scan = new Scanner(System.in);

    public Npc (String _name) {
        this.name = _name;
    }

    @Override
    void makeStat() {
        san = pow * 5;
        if(san >99)
            san = 99 - cp;
        cp = 0; //크툴루 포인트
        sanMax = pow * 5;

        str = scan.nextInt();
        con = scan.nextInt();
        siz = scan.nextInt();
        intel = scan.nextInt();
        pow = scan.nextInt();
        dex = scan.nextInt();
        app = scan.nextInt();
        edu = scan.nextInt();

        idea = intel * 5;
        if(idea > 99)
            idea = 99;
        luck = pow * 5;
        if(luck > 99)
            luck = 99;
        know = edu * 5;
        if(know > 99)
            know = 99;

        maxHp = (con + siz) % 2;;
        hp = maxHp;
        maxMp = pow;
        mp = maxMp;

        db = siz + str;
    }

    static void saveStat(Playable[] playable) {
        Json data = new Json(playable);
        data.saveJson();
    }
}
