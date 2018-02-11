package com.harsh.practice.codewars;

import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class MinLength {

	public static void main(String[] args) {
		String s = "The quick brown fox jumps over the lazy dog";
		long t1=0,t2=0;
		
		t1 = System.currentTimeMillis();
		int result1 = Pattern.compile(" ")
						.splitAsStream(s)
						.mapToInt(String::length)
						.min()
						.orElse(0);
		t2 = System.currentTimeMillis();
		System.out.println("Elapsed time in Pattern method: "+ (t2 - t1));
		
		t1=0;t2=0;
		t1 = System.currentTimeMillis();
		int result2 = Arrays.stream(s.split(" "))
								.mapToInt(e -> e.length())
								.min()
								.getAsInt();
		t2 = System.currentTimeMillis();
		
		t1=0;t2=0;
		System.out.println("Elapsed time in Arrays.stream method: "+ (t2 - t1));	
		
		t1 = System.currentTimeMillis();
		int result3 = Stream.of(s.split(" "))
								.mapToInt(e -> e.length())
								.min()
								.getAsInt();
		t2 = System.currentTimeMillis();
		System.out.println("Elapsed time in Stream.of method: "+ (t2 - t1));	
		
		t1=0;t2=0;
		t1 = System.currentTimeMillis();
		String[] a = s.split(" ");
        int shortest = a[0].length();
        for(String x:a) {
          if(x.length()<shortest) shortest=x.length();  
        }
        t2 = System.currentTimeMillis();
        System.out.println("Elapsed time in My method: "+ (t2 - t1));
        
        t1=0;t2=0;
		t1 = System.currentTimeMillis();
		String[] a2 = s.split(" ");
        String shortest2 = a[0];
        for(String x:a2) {
          if(x.length()<shortest2.length()) shortest2=x;  
        }        
        t2 = System.currentTimeMillis();
        System.out.println("Elapsed time in My 2nd method: "+ (t2 - t1));
	    
	}
	
}
