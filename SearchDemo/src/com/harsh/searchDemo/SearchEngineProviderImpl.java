package com.harsh.searchDemo;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

public class SearchEngineProviderImpl implements SearchEngineProvider 
{
	private List<String> searchEnginesList;

	@Override
	public List<String> getSearchEnginesList() 
	{
		return this.searchEnginesList;
	}

	@Override
	public String makeURL(String searchString, String searchEngine) throws UnsupportedEncodingException 
	{
		
		switch (searchEngine) {
		case "Google":
			return "https://www.google.co.in/search?q="+URLEncoder.encode(searchString.trim(),"UTF-8");		
			
		case "Bing":
			return "http://www.bing.com/search?q="+URLEncoder.encode(searchString.trim(),"UTF-8");
			
		case "Yahoo":
			return "https://search.yahoo.com/search?p="+URLEncoder.encode(searchString.trim(),"UTF-8");
					
		default:
			return null;
		}		
		
	}
	
	public SearchEngineProviderImpl()
	{
		searchEnginesList = new ArrayList<String>();
		searchEnginesList.add("Google");
		searchEnginesList.add("Bing");
		searchEnginesList.add("Yahoo");
	}
	
	
}
