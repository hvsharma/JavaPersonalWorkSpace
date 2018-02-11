package com.harsh.practice.codewars;

public class MoneyMoney {

	public static void main(String[] args) {
		long t1=0, t2=0;
		int result = 0;
		
		t1 = System.currentTimeMillis();
		result = calculateYearsMyMethod(1000.00, .05, 0.18, 1100.00);
		t2 = System.currentTimeMillis();
		System.out.println("Result: " + result + " and Time Elapsed: " + (t2 - t1));
		
		t1 = System.currentTimeMillis();
		result = calculateYearsBestMethod(1000.00, .05, 0.18, 1100.00);
		t2 = System.currentTimeMillis();
		System.out.println("Result: " + result + " and Time Elapsed: " + (t2 - t1));
	}
	
	public static int calculateYearsMyMethod(double principal, double interest,  double tax, double desired) {
	    int time = 0; 
	    Double amount = principal;
	    while(amount<desired) {
	    	time += 1;
	    	amount = amount + (amount*interest) - (amount*interest*tax);	   	    	
	    }
	    return time;
	}
	
	public static int calculateYearsBestMethod(double principal, double interest,  double tax, double desired) {
	    int years = 0; 
	    while(principal<desired) {
	    	years++;
	    	principal += (principal*interest)*(1 - tax);	   	    	
	    }
	    return years;
	}
}
