package com.harsh.propsDemo;

public class MainController
{
	private String name;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	
	public String submit()
	{
		if (!(this.name==null)||!(this.name.isEmpty()))
		{
			return "success";
		}
		else
		{
			return null;
		}
	}
}
