package com.example.android.quakereport;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JSON {

    static String practiceJSON = ""+
            "{" +
                "\"VideoGames\" :[" +
                "{" +
                    "\"Name\": \"Five Nights at Freddy's\"" +
                    "\"System\": \"PC\"" +
                    "\"Price\": \"10\"" +
                    "\"ESRP\": \"T\"" +
                    "\"Genre\": \"Horror\""+
                "}" +
                "]" +
            "}" ;

    public static void main (String[] args) {

        try{
            JSONObject root = new JSONObject(practiceJSON);
            JSONArray gamesArray = root.getJSONArray("VideoGames");
            JSONObject firstGame = gamesArray.getJSONObject(0);
            String name = firstGame.getString("name");
            System.out.println(name);
        }
        catch(JSONException E) {

        }
    }

}

