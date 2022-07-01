package com.javaex.ch01;

import java.util.HashMap;

public class Solution6 {
	
	public static int solution(String[][] clothes) {
		int answer = 1;
				HashMap<String, Integer> hash =new HashMap<>();

		for (String[] strings : clothes) {
					hash.put(strings[1], hash.getOrDefault(strings[1], 0) + 1);
				}

		for (int value : hash.values()) {
					answer *= (value+1) ;
				}

		return answer-1;
			}

}
