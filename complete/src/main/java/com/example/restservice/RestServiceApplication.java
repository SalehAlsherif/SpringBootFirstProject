package com.example.restservice;

import com.exmaple.utilities.APIHelpers;
import org.json.simple.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestServiceApplication {

    public static void main(String[] args) {
        try{
            JSONObject jsonObject=APIHelpers.GetRequest("https://api.github.com/search/repositories?q=created:%3E30&sort=stars&order=desc");
            TrendingLanguagesController.setTrendingLanguages(TopRepositoriesProcessor.processTrendingRepositories(jsonObject));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        SpringApplication.run(RestServiceApplication.class, args);
    }

}
