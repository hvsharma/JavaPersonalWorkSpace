package com.harsh.ajaxJSFDemo;

import java.util.Random;

public class RandomNumberController
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
		this.number=10*(new Random()).nextDouble();
		return null;
	}
	
	public String commence()
	{
		System.out.println("Commence method fired!!!");
		return null;
	}
	
	public RandomNumberController()
	{
		this.randomize();
	}
}