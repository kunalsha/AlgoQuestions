package com.practice.interview.IntPrep.string;

import java.util.Arrays;
import java.util.List;

public class ReverseCharInStrings {
	public static void main(String[] args) {
		reverseCharInStrings("This is not a statement");
		reverseCharMaintainOrder("This is not a statement");

	}

	private static void reverseCharInStrings(String str) {
		
		List<String> list = Arrays.asList(str.split(" "));
		
		StringBuilder sb = new StringBuilder();
		
		for (String words : list) {
			for(int i=words.length()-1; i>=0;i--) {
				sb.append(words.charAt(i));
			}
			sb.append(" ");
		}
		
		System.out.println("Reverse is : " + sb.toString());
		
	}
	
	private static void reverseCharMaintainOrder(String str) {
		
		List<String> list = Arrays.asList(str.split(" "));
		
		StringBuilder sb = new StringBuilder();
		
		for (String words : list) {
			for(int i=words.length()-1; i>=0;i--) {
				sb.append(words.charAt(i));
			}
			sb.append(" ");
		}
		
		System.out.println("Reverse is : " + sb.toString());
		
	}
	
	//string - ringst
}
