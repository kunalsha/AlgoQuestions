package com.practice.ds.string;

public class ListOfAnagrams {
	public static void main(String[] args) {
		allPermutations("", "XYZA");
	}

	private static void allPermutations(String prefix, String value) {
		
		int len = value.length();
		
		if(len == 0) System.out.println(prefix);
		else {
			for (int i=0;i<len;i++)
				allPermutations(prefix + value.charAt(i), value.substring(0, i) + value.substring(i+1, len));
		}
	}
}
