package com.example.restservice;

import java.util.List;

public class TrendingLanguages {
    private List<String> topLanguages;
    private List<TrendingLanguage> trendingLanguages;

    public TrendingLanguages(List<String> topLanguages, List<TrendingLanguage> trendingLanguages) {
        this.topLanguages = topLanguages;
        this.trendingLanguages = trendingLanguages;
    }

    public List<String> getTopLanguages() {
        return topLanguages;
    }

    public List<TrendingLanguage> getTrendingLanguages() {
        return trendingLanguages;
    }
}
