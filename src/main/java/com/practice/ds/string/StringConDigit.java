package com.practice.ds.string;

public class StringConDigit {
	public static void main(String[] args) {
		String str = "8337373jd";
		checkString(str);
	}

	private static void checkString(String str) {
		char[] charArr = str.toCharArray();
		for(char c : charArr) {
			System.out.println(c);

			int i = c - '0';
			System.out.println(i);
			
		}
	}
}
