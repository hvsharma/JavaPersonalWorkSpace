package com.harsh.ajaxJSFDemo;

import java.util.Random;

public class RandomNumberControllerAjax
{
	private double number;

	public double getNumber()
	{
		return number;
	}

	public void setNumber(double number)
	{
		this.number = number;
	}
	
	public String randomize()
	{
		try
		{
			Thread.sleep(3000);
		}
		catch (InterruptedException e)
		{
			
		}
		this.number=10*(new Random()).nextDouble();
		return null;
	}
	
	public String commence()
	{
		System.out.println("Commence method fired!!!");
		return null;
	}
	
	public RandomNumberControllerAjax()
	{
		this.randomize();
	}
}