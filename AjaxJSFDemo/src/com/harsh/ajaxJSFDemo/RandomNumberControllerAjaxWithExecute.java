package com.harsh.ajaxJSFDemo;

import java.util.Random;

public class RandomNumberControllerAjaxWithExecute
{
	private double number;
	
	private int range;

	public double getNumber()
	{
		return number;
	}

	public void setNumber(double number)
	{
		this.number = number;
	}
	
	public int getRange()
	{
		return range;
	}

	public void setRange(int range)
	{
		this.range = range;
	}

	public String randomize()
	{
		this.number=this.range*(new Random()).nextDouble();
		return null;
	}
	
	public String commence()
	{
		System.out.println("Commence method fired!!!");
		return null;
	}
	
	public RandomNumberControllerAjaxWithExecute()
	{
		this.range=10;
		this.randomize();
	}
}