package com.practice.interview.IntPrep.array;

import java.util.Arrays;


public class FormLargest {

	public static void main(String[] args) {

		int[] arr = {324,33,5,34, 9, 8};
		
		System.out.println(Long.valueOf(largestNumber(arr)));
	}

	private static String largestNumber(int[] arr) {
		
		String[] strArr = new String[arr.length];
		
		for(int i=0;i<arr.length;i++)
			strArr[i] = String.valueOf(arr[i]);
		
		Arrays.sort(strArr, (a,b) -> (b+a).compareTo(a+b));
		
		StringBuilder sb= new StringBuilder();
		
		for(int i=0;i<strArr.length;i++)
			sb = sb.append(strArr[i]);
		
		
		
		return sb.toString();
	}
	

}
