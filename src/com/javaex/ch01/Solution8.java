package com.javaex.ch01;

public class Solution8 {
	
	public int solution(int n) {
	long mole = 1;
	long deno = 1;
	int num = 2 * n;
	
	for (int i = 1; i <= n; i++) {
	            mole *= num--;
	            deno *= i;
	        }
	
	return (int) (mole / (deno * (n + 1)));
	    }
 
}
