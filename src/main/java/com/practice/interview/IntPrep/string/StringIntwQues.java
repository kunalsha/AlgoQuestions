package com.practice.interview.IntPrep.string;

import java.util.HashSet;
import java.util.Set;

public class StringIntwQues {
	public static void main(String[] args) {
		String str = "Howaaareyou";
		//replaceChar(str);
		printDuplicate(str);
	}

	private static void printDuplicate(String str) {
		char[] arr = str.toCharArray();
		Set<Character> orig = new HashSet<>();
		for(char c : arr) {
			if(orig.add(c)==false)
				System.out.println(c);
		}
	}

	private static void replaceChar(String str) {
		//str = str.replace('a', 'd');
		//System.out.println(str);
		int i = 0;
		while((i = str.indexOf('o')) != -1) {
			System.out.println(i);
			//str = str.substring(0, i-1) + "d" + str.substring(i+1, str.length());
		}
		System.out.println(str);
	}

}
