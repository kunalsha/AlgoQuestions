package com.practice.ds.situation;

public class CountChars {

	public static void main(String[] args) {
		String str = "Hello$Worwld$";
		findChars(str);
	}

	private static void findChars(String str) {
		char[] chInt =str.toCharArray();
		int count = 0;
		for (int i=0;i<chInt.length;i++) {
			int j = i-1;
			if(chInt[i] == '$' && chInt[j] == ',') {
				continue;
			} else 
				count++;
		}
		
		System.out.println("Count is " + count);
	}

}
