package com.harsh.searchDemo;

import java.io.UnsupportedEncodingException;
import java.util.List;

public interface SearchEngineProvider 
{
	public List<String> getSearchEnginesList();
	public String makeURL(String searchString, String searchEngine) throws UnsupportedEncodingException ;
	
}
