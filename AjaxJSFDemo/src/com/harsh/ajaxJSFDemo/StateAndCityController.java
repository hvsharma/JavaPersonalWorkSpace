package com.harsh.ajaxJSFDemo;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.faces.event.AjaxBehaviorEvent;

import com.harsh.ajaxJSFDemo.util.DataProvider;

public class StateAndCityController
{
	private Map<String, Map<String,BigInteger>> statesAndCitiesMap;

	private List<String> statesList;
	
	private List<String> citiesList;

	private String state;
	
	private String city;
	
	private String population;
	
	public List<String> getStatesList()
	{
		return statesList;
	}

	public List<String> getCitiesList()
	{
		return citiesList;
	}

	public String getState()
	{
		return state;
	}

	public void setState(String state)
	{
		this.state = state;
	}

	public String getCity()
	{
		return city;
	}

	public void setCity(String city)
	{
		this.city = city;
	}
	
	public String getPopulation()
	{
		return population;
	}

	public void populateStates()
	{
		population=null;
		city=null;
		statesList = new ArrayList<String>();
		for (String key : statesAndCitiesMap.keySet())
		{
			statesList.add(key);
		}
				
	}
	
	public void populateCities(AjaxBehaviorEvent e)
	{
		population=null;
		city=null;
		
		if(statesList!=null && (!statesList.isEmpty()) && state!=null)
		{
			boolean contains=false;
			
			for (String string : statesList)
			{
				if(string.equalsIgnoreCase(state))
				{	
					contains=true;
					break;
				}
			}
			
			if(contains)
			{
				Map<String, BigInteger> citiesMap = statesAndCitiesMap.get(state);
				if(citiesMap!=null)
				{
					citiesList = new ArrayList<String>();
					
					for (String string : citiesMap.keySet())
					{
						citiesList.add(string);
					}
				}
			}
			else
			{
				population=null;
				citiesList=new ArrayList<String>();
			}
		}
		else
		{
			population=null;
			citiesList=new ArrayList<String>();
		}	
				
	}
	
	public void updatePopulation(AjaxBehaviorEvent e)
	{
		population=null;
		if(statesList!=null && (!statesList.isEmpty()) && state!=null && citiesList!=null && (!citiesList.isEmpty()) && city!=null)
		{
			boolean contains=false;
			
			for (String string : statesList)
			{
				if(string.equalsIgnoreCase(state))
				{	
					contains=true;
					break;
				}
			}
			
			if(contains)
			{
				Map<String, BigInteger> citiesMap = statesAndCitiesMap.get(state);
				
				if(citiesMap!=null)
				{
					if(citiesMap.containsKey(city))
					{
						population = String.valueOf(citiesMap.get(city));
					}
				}
			}
		}
		
	}
		
	public StateAndCityController()
	{
		this.statesAndCitiesMap = DataProvider.getStatesAndCitiesMap();
		this.citiesList = new ArrayList<String>();
		this.statesList = new ArrayList<String>();
		this.populateStates();
	}
}
