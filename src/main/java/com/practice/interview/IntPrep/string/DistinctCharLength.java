package com.practice.interview.IntPrep.string;

import java.util.HashSet;
import java.util.Set;

public class DistinctCharLength {
	public static void main(String[] args) {
		String str = "geeksforgeeks";
		findlongestDistinct(str);
	}

	private static void findlongestDistinct(String str) {
		
		char[] arr = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		Set<Character> set = new HashSet<>();
		String longest = "";
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				if(set.add(arr[j])) {
					sb = sb.append(arr[j]);
				}else {
					if(longest.length() < sb.length()) {
						longest = sb.toString();
						sb.setLength(0);
						set.clear();
						break;
					}
				}
			}
		}
		System.out.println(longest);

		System.out.println(longest.length());
	}
}
