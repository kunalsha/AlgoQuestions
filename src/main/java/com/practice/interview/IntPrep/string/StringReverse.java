package com.practice.interview.IntPrep.string;

import java.util.Arrays;

public class StringReverse {
	public static void main(String[] args) {
		reverse("This is a normal string");
		reverseString("This is a normal string");
		System.out.println(new StringBuilder("This is a normal string").reverse());
	}

	private static void reverseString(String string) {
		StringBuilder sb = new StringBuilder(string);
		for(int i=0, j=sb.length()-1;i<sb.length()/2;i++,j--) {
			char temp = sb.charAt(i);
			sb.replace(i, i+1, sb.charAt(j)+"");
			sb.replace(j, j+1, temp+"");
			
		}
		System.out.println(sb.toString());

	}

	private static void reverse(String string) {
		String[] charArr = string.split(" ");
		int len = charArr.length;
		int limit = ((int)len/2);
		for(int i=0,j=len-1;i<len/2;i++,j--) {
			String temp = charArr[i];
			charArr[i] = charArr[j];
			charArr[j] = temp;
		}
		
		System.out.println(Arrays.toString(charArr));
	}
}
