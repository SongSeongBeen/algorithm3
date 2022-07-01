package com.javaex.ch01;

public class Solution10 {
	
	public long[] solution(int x,int n) {
		
		
		long[] anwer = new long[n];
		long num = x;
		
		for(int i= 0; i< anwer.length; i++) {
			anwer[i] = num;
			num += x;
		}
		
		return anwer;
	}
	
}
