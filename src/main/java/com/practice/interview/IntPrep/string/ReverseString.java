package com.practice.interview.IntPrep.string;

public class ReverseString {
	public static void main(String[] args) {
		String str = "This is a string";
		//System.out.print(reverseRec(str));
		System.out.print(reverseRecItr(str));

	}

	private static String reverseRecItr(String str) {
		char[] charArr = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		for(int i=charArr.length-1;i>=0;i--) {
			sb = sb.append(charArr[i]);
			System.out.println(sb.toString());
		}
		return sb.toString();
	}

	private static String reverseRec(String str) {	
		int len = str.length();
		if(len==0) {
			return "";
		}
		System.out.println(str.charAt(len-1) + str.substring(0, len-1));
		return str.charAt(len-1)+ reverseRec(str.substring(0, len-1));
	}
}
