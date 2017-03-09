package com.harsh.actionListenerDemo;

import java.util.Locale;
import javax.faces.event.ActionEvent;

public class LocaleChanger
{
	private Locale locale;

	public Locale getLocale()
	{
		return locale;
	}

	public void setLocale(Locale locale)
	{
		this.locale = locale;
	}

	public void changeLocale(ActionEvent e)
	{
		System.out.println(this.locale.toString());
		if(this.locale.toString().equals(Locale.ENGLISH.toString()))
		{
			System.out.println("inside if");
			this.locale=Locale.FRANCE;
			System.out.println("New Locale = " + this.locale.toString());
		}
		else
		{
			System.out.println("Inside else");
			this.locale=Locale.ENGLISH;
			System.out.println("new Locale = "+ this.locale.toString());
		}
				
	}
}
