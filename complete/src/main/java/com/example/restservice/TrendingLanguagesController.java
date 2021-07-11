package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrendingLanguagesController {

	private static TrendingLanguages trendingLanguages;

	public static TrendingLanguages getTrendingLanguages() {
		return trendingLanguages;
	}

	public static void setTrendingLanguages(TrendingLanguages trendingLanguages) {
		TrendingLanguagesController.trendingLanguages = trendingLanguages;
	}

	@GetMapping("/")
	public TrendingLanguages topLanguages(){
		return getTrendingLanguages();
	}
}
