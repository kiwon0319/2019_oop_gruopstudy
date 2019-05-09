public class main{
    int players = 5;
    String[] playername = ("a","b","c","d","e");
    Playable p[]= new Playable[players];

    for(int i=0; i<players; i++){
        p[i] = new Playable(playername[0]);
        p[i].makeStat();
    }
}