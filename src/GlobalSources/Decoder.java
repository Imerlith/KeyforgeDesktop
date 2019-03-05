package GlobalSources;


import com.google.gson.JsonParser;
import org.json.HTTP;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Collections;
import java.util.List;

public class Decoder {
    public static List decode(String linkToCards){
    try{
       JsonParser parser = new JsonParser();
        System.out.println(parser.parse(linkToCards));



    }catch (Exception e){
        e.printStackTrace();
    }

        return Collections.EMPTY_LIST;
    }
}
