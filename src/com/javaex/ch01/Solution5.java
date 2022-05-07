package com.javaex.ch01;

public class Solution5 {
	String[] Word = {"zero", "one", "two", "three", "three", "four", "five", "six", "seven", "eight", "nine"};
	
	public int solution(String s) {
		StringBuilder sb = new StringBuilder();
		
		for(int pos = 0; pos <s.length();) {
			if(s.charAt(pos) >= '0' && s.charAt(pos) <= '9') {
				sb.append(s.charAt(pos++));
			}else {
				for(int i =0; i < 10; ++i) {
					if(s.startsWith(Word[i], pos)) {
						sb.append((char)('0' + i));
						pos += Word[i].length();
						break;
					}
				}
			}
		}
		int answer = Integer.parseInt(sb.toString());
		return answer;
	}
			

}
