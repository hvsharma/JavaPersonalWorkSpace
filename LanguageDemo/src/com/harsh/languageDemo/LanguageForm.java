package com.harsh.languageDemo;

public class LanguageForm 
{
	private String language;

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	
	public String checkLanguage()
	{
		if(!(language==null))
		{
			if(!(language.isEmpty()))
			{
				if(language.equalsIgnoreCase("java"))
				{
					return "confirm";
				}
				else
				{
					return "warning";
				}
			}
			else
			{
				return "error";
			}
		}
		else
		{
			return "error";
		}
	}
}
