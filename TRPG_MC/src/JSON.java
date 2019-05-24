import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.IOException;
import java.io.File;
import java.io.FileWriter;


public class JSON {
    Playable[] playables;
    JSONArray data=new JSONArray();

    public  JSON(Playable[] _playble){
        playables=_playble;
    }

    public JSONObject stat(int i){
        JSONObject statObject= new JSONObject();
        statObject.put("str",playables[i].str);
        statObject.put("con",playables[i].con);
        statObject.put("siz",playables[i].siz);
        statObject.put("intel",playables[i].intel);
        statObject.put("pow",playables[i].pow);
        statObject.put("dex",playables[i].dex);
        statObject.put("app",playables[i].app);
        statObject.put("edu",playables[i].edu);
        return statObject;
    }
    public  JSONObject state(int i){
        JSONObject stateObject=new JSONObject();

        stateObject.put("Hp",playables[i].hp);
        stateObject.put("Mp",playables[i].mp);
        stateObject.put("Cp",playables[i].cp);

        return stateObject;
    }
    public  JSONObject character(int i){
        JSONObject charObject=new JSONObject();
        charObject.put("name",playables[i].name);
        charObject.put("stat",stat(i));
        charObject.put("state",state(i));

        return charObject;
    }
    public  void buildData(){
        for(int i=0; i<playables.length; i++){
            data.add(character(i));
        }
    }
    public void  saveJSON(){
        try{
        String path=System.getProperty("user.dir");
        FileWriter file=new FileWriter(path + File.separator + "data.json");
        file.write((data.toJSONString()));
        file.flush();
        file.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
