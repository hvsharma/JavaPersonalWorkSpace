package com.harsh.practice.codewars;

import java.util.stream.IntStream;


public class DontGiveFive {
	
	public static void main(String[] args) 
	{
		dontGiveMeFiveMyMethod(4, 17);
		dontGiveMeFiveBestSolution(4, 17);
		long t1=0, t2=0;
		t1 = System.currentTimeMillis();
		long result1 = dontGiveMeFiveOneLiner(4,17);
		t2 = System.currentTimeMillis();
	    System.out.println("Result dontGiveMeFiveOneLiner: " + result1 + " and Elapsed time: " + (t2 - t1));	
	    
	    t1 = System.currentTimeMillis();
	    long result2 = dontGiveMeFiveOneMore(4,17);
	    t2 = System.currentTimeMillis();
	    System.out.println("Result dontGiveMeFiveOneMore: " + result2 + " and Elapsed time: " + (t2 - t1));	
	    dontGiveMeFiveAnother(4,17);
	}
	
	public static int dontGiveMeFiveMyMethod(int start, int end)
	{
		long t1=0, t2=0, count = 0;
		t1 = System.currentTimeMillis();
		
		count = IntStream.rangeClosed(start, end)					
					.filter(e -> !String.valueOf(e).contains("5"))
					.count();		
		t2 = System.currentTimeMillis();
		System.out.println("Result dontGiveMeFiveMyMethod : " + count + " and Elapsed time: " + (t2 - t1));		
		return ((Long)count).intValue();
	}
	
	public static int dontGiveMeFiveBestSolution(int start, int end)
	{
	    int ans = 0;
	    long t1=0, t2=0;
	    t1 = System.currentTimeMillis();
	    for (int i = start; i <= end; i++) {
	      if (!("" + i).contains("5")) ans++;
	    }
	    t2 = System.currentTimeMillis();
	    System.out.println("Result dontGiveMeFiveBestSolution: " + ans + " and Elapsed time: " + (t2 - t1));	
	    return ans;
	}
	
	public static long dontGiveMeFiveOneLiner(int start, int end)
	{
		return IntStream.rangeClosed(start, end).filter(x -> !String.valueOf(x).matches(".*5.*")).count();
	}
	
	public static long dontGiveMeFiveOneMore(int start, int end)
	{
		return Long.valueOf(IntStream.rangeClosed(start, end)
		        .mapToObj(Integer::toString)
		        .filter(i -> !i.contains("5"))
		        .count()).intValue();
	}
	
	private static boolean numberHasFives(int number) 
	{
	    while (number != 0) {
	      if ((number % 10) != 0) {
	        if ((number % 5) == 0) {
	          return true;
	        }
	      }
	      number /= 10;      
	    }
	    return false;
	  }
	  
	public static void dontGiveMeFiveAnother(int start, int end) 
	{
		long t1=0, t2=0;
		t1 = System.currentTimeMillis();
		int totalNumbers = end - start + 1; 
	    for (int i=start; i<=end; i++) {
	      if (numberHasFives(i)) {
	        totalNumbers --;
	      }
	    }
	    t2 = System.currentTimeMillis();
	    System.out.println("Result dontGiveMeFiveAnother: " + totalNumbers + " and Elapsed time: " + (t2 - t1)); ;
	  }
}
