public class Playable extends Players{

    public Playable (String _name){
        this.name = _name;
    }

    @Override
    void makeStat() {
        int san = pow * 5;
        if(san >99)
            san = 99 - cp;
        int cp = 0; //크툴루 포인트
        int sanMax = pow * 5;

        int str = Dice.roll(3, 6);
        int con = Dice.roll(3, 6);
        int siz = Dice.roll(2,6) + 6;
        int intel = Dice.roll(2, 6) + 6;
        int pow = Dice.roll(3, 6);
        int dex = Dice.roll(3, 6);
        int app = Dice.roll(3, 6);
        int edu = Dice.roll(3, 6) + 6;

        int idea = intel * 5;
        if(idea > 99)
            idea = 99;
        int luck = pow * 5;
        if(luck > 99)
            luck = 99;
        int know = edu * 5;
        if(know > 99)
            know = 99;

        int maxHp = (con + siz) % 2;;
        int hp = maxHp;
        int maxMp = pow;
        int mp = maxMp;

        int db = siz + str;
    }
}