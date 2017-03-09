package com.harsh.ajaxJSFDemo.util;

import java.math.BigInteger;
import java.util.LinkedHashMap;
import java.util.Map;


public class DataProvider
{
		
	public static Map<String, Map<String,BigInteger>> getStatesAndCitiesMap()
	{
		Map<String,Map<String,BigInteger>> statesAndCitiesMap=null;
		
		statesAndCitiesMap = new LinkedHashMap<String, Map<String,BigInteger>>();
		
		Map<String,BigInteger> mpCities = new LinkedHashMap<String,BigInteger>();
		
		mpCities.put("Bhopal", new BigInteger("999900"));
		mpCities.put("Indore", new BigInteger("1236723"));		
		mpCities.put("Jabalpur", new BigInteger("8924795"));		
		mpCities.put("Gwalior", new BigInteger("723641"));		
		
		statesAndCitiesMap.put("Madhya Pradesh", mpCities);
		
		Map<String,BigInteger> rajasthanCities = new LinkedHashMap<String,BigInteger>();
		
		rajasthanCities.put("Jaipur", new BigInteger("978700"));
		rajasthanCities.put("Kota", new BigInteger("434447"));		
		rajasthanCities.put("Bikaner", new BigInteger("123126"));		
		rajasthanCities.put("Alwar", new BigInteger("2344634"));
		
		statesAndCitiesMap.put("Rajasthan", rajasthanCities);
		
		Map<String,BigInteger> telanganaCities = new LinkedHashMap<String,BigInteger>();
		
		telanganaCities.put("Hyderabad", new BigInteger("978700"));
		telanganaCities.put("Vijaywada", new BigInteger("347852"));		
		telanganaCities.put("Warangal", new BigInteger("8114536"));		
		telanganaCities.put("Khammam", new BigInteger("1251453"));
		
		statesAndCitiesMap.put("Telangana", telanganaCities);
		
		return statesAndCitiesMap;
	}
		
}
