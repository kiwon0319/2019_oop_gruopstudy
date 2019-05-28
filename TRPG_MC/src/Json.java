import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Json {
    Playable[] playables;
    JSONArray data = new JSONArray();

    public Json(Playable[] _playable){
        playables = _playable;
    }

    private JSONObject stat(int i){
        JSONObject statObject = new JSONObject();
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

    private JSONObject state(int i){
        JSONObject stateObject = new JSONObject();

        stateObject.put("Hp",playables[i].hp);
        stateObject.put("Mp",playables[i].mp);
        stateObject.put("CP",playables[i].cp);

        return stateObject;
    }

    private JSONObject charactor(int i){
        JSONObject charObject = new JSONObject();

        charObject.put("name", playables[i].name);
        charObject.put("stat", stat(i));
        charObject.put("state",state(i));

        return charObject;
    }

    private void buildData(){
        for(int i = 0; i < playables.length; i++){
            data.add(charactor(i));
        }
    }

    public JSONArray getJsonArray(){
        return data;
    }

    public void saveJson(){
        buildData();
        try{
            String path = System.getProperty("user.dir");
            FileWriter file = new FileWriter(path + File.separator + "data.json");
            file.write(data.toJSONString());
            file.flush();
            file.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

//System.out.prinln(Json(playable).getJsonArray());