import  java.io.File;
import  java.io.FileWriter;
import  java.io.IOException;

import  org.json.simple.JSONArray;
import  org.json.simple.JSONObject;

public class Json {
    Playable[] playables;
    JSONArray data = new JSONArray();

    public Json(Playable[] _playable){ playables = _playable; }

    public JSONObject stat(int i) {
        JSONObject stateObject = new JSONObject();
        stateObject.put("str", playables[i].str);
        stateObject.put("con", playables[i].con);
        stateObject.put("siz", playables[i].siz);
        stateObject.put("intel", playables[i].intel);
        stateObject.put("pow", playables[i].pow);
        stateObject.put("dex", playables[i].dex);
        stateObject.put("app", playables[i].app);
        stateObject.put("edu", playables[i].edu);

        return stateObject;
    }

    public JSONObject state(int i){
        JSONObject stateObject = new JSONObject();

        stateObject.put("HP", playables[i].hp);
        stateObject.put("MP", playables[i].mp);
        stateObject.put("CP", playables[i].cp);

        return stateObject;
    }

    public JSONObject charactor(int i){
        JSONObject charObject = new JSONObject();

        charObject.put("name", playables[i].name);
        charObject.put("stat", stat(i));
        charObject.put("state", state(i));

        return charObject;
    }

    // 메모리에 json으로 올림
    public void buildData(){
        for(int i =0;i<playables.length;i++)
            data.add(charactor(i));
    }

    // 디버깅용
    public JSONArray getJsonArray() {
        return data;
    }

    public void saveJson() {
        try{
            String path = System.getProperty("user.dir");
            FileWriter file = new FileWriter(path + File.separator + "data.json");
            file.write(data.toJSONString());
            file.flush(); // 파일 안의 찌꺼기 제거
            file.close();
        }catch (IOException e) {
            e.printStackTrace();
        }

    }
}
