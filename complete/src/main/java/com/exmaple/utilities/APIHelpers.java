package com.exmaple.utilities;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class APIHelpers {
    public static JSONObject GetRequest(String Url) throws IOException, ParseException {
        URL url = new URL(Url);
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();
        int responseCode = connection.getResponseCode();
        if(responseCode != 200){
            throw new RuntimeException("HttpResponseCode: " +responseCode);
        }
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(url.openStream()));
        StringBuilder content=new StringBuilder("");
        String line;
        while((line=bufferedReader.readLine())!=null){
            content.append(line);
        }
        JSONParser parser = new JSONParser();
        JSONObject jsonObject = (JSONObject)parser.parse(content.toString());
        return jsonObject;
    }
}
