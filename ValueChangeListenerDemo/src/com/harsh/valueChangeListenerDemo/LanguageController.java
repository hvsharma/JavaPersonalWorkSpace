package com.harsh.valueChangeListenerDemo;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

public class LanguageController
{
	private Locale locale;
	
	private String name;
	
	private static Map<String, Locale> localeMap = new LinkedHashMap<String, Locale>();
	
	static 
	{
		localeMap.put("English", Locale.ENGLISH);
		localeMap.put("France", Locale.FRANCE);
	}
	
	public Locale getLocale()
	{
		return locale;
	}

	public void setLocale(Locale locale)
	{
		this.locale = locale;
	}

	public Map<String, Locale> getLocaleMap()
	{
		return localeMap;
	}
	
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	
	public void changeLocale(ValueChangeEvent e)
	{
		System.out.println(e.getNewValue().toString());
		if(e.getNewValue().toString().equalsIgnoreCase(Locale.FRANCE.toString()))
		{
			this.locale=Locale.FRANCE;
			this.name="France";
		}
		else if(e.getNewValue().toString().equalsIgnoreCase(Locale.ENGLISH.toString()))
		{
			this.locale=Locale.ENGLISH;
			this.name="English";
		}
		System.out.println(this.locale.toString());
		FacesContext.getCurrentInstance().getViewRoot().setLocale(this.locale);
		
	}
	
	public LanguageController()
	{
		this.locale=Locale.ENGLISH;
		this.name="English";
		System.out.println("Inside Constructor. New locale= "+this.locale.toString());
	}
	
	public String commence()
	{
		return null;
	}
	
		
}
