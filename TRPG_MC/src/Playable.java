public class Playable extends Players{
    @Override
    void makeStat() {
        cp = 0;

        str = Dice.roll(3, 6);
        con = Dice.roll(3, 6);
        siz = Dice.roll(2, 6) + 6;
        intel = Dice.roll(2, 6) + 6;
        pow = Dice.roll(3, 6);
        dex = Dice.roll(3, 6);
        app = Dice.roll(3, 6);
        edu = Dice.roll(3, 6) + 6;

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
