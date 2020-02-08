package com.practice.ds.string;

public class AllPerm {
	static int counter = 0;

	public static void main(String[] args) {
		String str = "abcd";
		
		System.out.println(printPerm("", str));
	}

	private static int printPerm(String prefix, String value) {
	
		if(value.length()==0) {
			System.out.println(prefix);
			counter++;
		}
			
		for(int i=0; i<value.length();i++)
			printPerm(prefix + value.charAt(i), value.substring(0, i) + value.substring(i+1, value.length()));
		
		
		return counter;
	}
}
