package com.example.restservice;

import java.util.ArrayList;
import java.util.List;

public class TrendingLanguage {

	private String language;
	private int count;
	private List<String>  repositoriesUrls;

	public TrendingLanguage(String language) {
		this.repositoriesUrls=new ArrayList<String>();
		this.count=0;
		this.language=language;
	}

	public String getLanguage() {
		return language;
	}

	public int getCount() {
		return count;
	}

	public List<String> getRepositoriesUrls() {
		return repositoriesUrls;
	}

	public void addRepositoryUrl(String repositoryUrl){
		repositoriesUrls.add(repositoryUrl);
		count=repositoriesUrls.size();
	}

}
