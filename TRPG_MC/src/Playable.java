public class Playable extends Players {
    public Playable (String _name){
        this.name = _name;
    }

    @Override
    void makeStat() {
        str = Dice.roll(3,6);
        con = Dice.roll(3,6);
        siz = Dice.roll(2,6) + 6;
        intel = Dice.roll(2,6) + 6;
        dex = Dice.roll(3,6);
        app = Dice.roll(3,6);
        edu = Dice.roll(3,6) + 6;
        
        idea = intel * 5;
        if(idea >= 100){
            idea = 99;
        }
        
        luck = pow * 5;
        if (luck >= 100){
            luck = 99;
        }
        
        know = edu * 5;
        if (know >= 100){
            know = 99;
        }
        
        db = siz + str;
        
        hp = (con + siz) / 2;
        mp = maxMp = pow;
    }

    static void saveStat(Playable[] playable) {
        Json data = new Json(playable);
        data.saveJson();
    }
    
}
