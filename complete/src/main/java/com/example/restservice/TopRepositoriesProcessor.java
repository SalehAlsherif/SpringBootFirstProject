package com.example.restservice;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;

public class TopRepositoriesProcessor {
    public static TrendingLanguages processTrendingRepositories(JSONObject jsonObject){
        HashMap<String,TrendingLanguage> trendingLanguagesMap=new HashMap<String,TrendingLanguage>();
        //Getting the items List
        JSONArray items = (JSONArray) jsonObject.get("items");
        for (int i = 0; i <items.size() ; i++) {
            JSONObject repositoryItem=(JSONObject)items.get(i);
            String language=(String)repositoryItem.get("language");
            String htmlUrl=(String)repositoryItem.get("html_url");
            trendingLanguagesMap.put(language,trendingLanguagesMap.getOrDefault(language,new TrendingLanguage(language)));
            TrendingLanguage trendingLanguage=trendingLanguagesMap.get(language);
            trendingLanguage.addRepositoryUrl(htmlUrl);
        }
        return new TrendingLanguages(new ArrayList(trendingLanguagesMap.keySet()), new ArrayList(trendingLanguagesMap.values()));
    }

}
