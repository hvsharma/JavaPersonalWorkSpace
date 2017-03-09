package com.harsh.navigationDemo;

import java.util.Random;

public class RandomUtils
{
	public static int generateRandomNumber()
	{
		Random r = new Random();
		return (r.nextInt(2) + 1);
	}
		
}
