package com.harsh.searchDemo;

import java.io.IOException;
import java.util.List;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletResponse;

public class SearchController 
{
	private String searchString;
	private String searchEngine;
	private List<String> searchEngineList;
	private SearchEngineProvider searchEngineProvider = new SearchEngineProviderImpl();
	
	public String getSearchString() {
		return searchString;
	}
	public void setSearchString(String searchString) {
		this.searchString = searchString;
	}
	public String getSearchEngine() {
		return searchEngine;
	}
	public void setSearchEngine(String searchEngine) {
		this.searchEngine = searchEngine;
	}
	
	public List<String> getSearchEngineList() {
		return searchEngineList;
	}
		
	public SearchController()
	{
		this.searchEngineList = searchEngineProvider.getSearchEnginesList();
		this.searchEngine = searchEngineList.get(0);
	}
	
	public String commenceSearch() throws IOException
	{
		if(!isAnyEmpty(searchString, searchEngine))
		{
			ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
			HttpServletResponse response = (HttpServletResponse) context.getResponse();
			try 
			{
				response.sendRedirect(searchEngineProvider.makeURL(searchString, searchEngine));
			} 
			catch (Exception e) 
			{
				return "invalid-search-string";
			}
		}
		return "no-input";
	}
	
	private boolean isAnyEmpty(String... strings) 
	{
		for (String string : strings) 
		{
			if(string==null||string.trim().isEmpty())
				return true;
		}
		
		return false;
	}
	
	
}
