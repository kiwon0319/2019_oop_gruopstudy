import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Json {
    Playable[] playables;
    JSONArray data = new JSONArray();

    public Json(Playable [] _playable) {
        playables = _playable;
    }

    public JSONObject stat(int i) {
        JSONObject statObj = new JSONObject();

        statObj.put("str",playables[i].str);
        statObj.put("con",playables[i].con);
        statObj.put("siz",playables[i].siz);
        statObj.put("intel",playables[i].intel);
        statObj.put("pow",playables[i].pow);
        statObj.put("dex",playables[i].dex);
        statObj.put("app",playables[i].app);
        statObj.put("edu",playables[i].edu);

        return statObj;
    }

    public JSONObject state(int i) {
        JSONObject stateObj = new JSONObject();

        stateObj.put("Hp",playables[i].hp);
        stateObj.put("Mp",playables[i].mp);
        stateObj.put("Cp",playables[i].cp);

        return stateObj;
    }

    public JSONObject charactor(int i) {
        JSONObject charObj = new JSONObject();

        charObj.put("name",playables[i].name);
        charObj.put("stat",stat(i));
        charObj.put("state",state(i));

        return charObj;
    }

    public void BuildData() {
        for(int i=0; i<playables.length; i++)
            data.add(charactor(i));
    }

    public void saveJson() {
        try{
            String path = System.getProperty("user.dir");
            FileWriter file = new FileWriter(path + File.separator + "data.json");
            file.write(data.toJSONString());
            file.flush();
            file.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}