package com.practice.ds.string;

public class StringToInteger {
	public static void main(String[] args) {
		System.out.println("Integer of 26262 is " + convertToString("26262"));
		//System.out.println("Integer of 26262 is " + convertToStringManually("26262"));

	}

	private static String convertToStringManually(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	//26262
	//str % 10 - 2
	// (str/10) % 10 - 6 - 6 * 10
	private static Integer convertToString(String string) {
		int intOfString = 0;
		
		for(int i=string.length(), j = 1;i>0;i--) {
			
			int number = string.charAt(i-1) -'0';
			System.out.println(number);
			intOfString = intOfString + (number*j);
			System.out.println("intOfString " + intOfString);
			j*=10;
		}
		return intOfString;
	}
}
