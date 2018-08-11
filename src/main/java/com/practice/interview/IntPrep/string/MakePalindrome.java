package com.practice.interview.IntPrep.string;

public class MakePalindrome {
	public static void main(String[] args) {
		String str = "abab";
		System.out.println(makePal(str));
	}

	// a b a b # b a b a
	// 0 0 0 0 0 0 0 0 0
//  j  0
	private static String makePal(String str) {
		
		//Get reverse of String
		String rev = new StringBuilder(str).reverse().toString();
		
		//Create new string equal to rev#str
		String l = str + "#" + rev;
		
		//create array with l length
		int[] p = new int[l.length()];
		
		//build KMP table
		for(int i=1;i<l.length();i++) {
			//update prefix boundary
			int j = p[i-1];

			System.out.println("" + l.charAt(i) + " " + l.charAt(j));

			while(j>0 && l.charAt(i)!=l.charAt(j)) {
				System.out.println("Not Matched: " + l.charAt(i) + " " + l.charAt(j));
				j=p[j-1];
			}
			
			if(l.charAt(i)==l.charAt(j)) {
				System.out.println("Matched: " + l.charAt(i) + " " + l.charAt(j));

				p[i] = j+1;
			}
		}
		return rev.substring(0, str.length() -p[l.length()-1]) + str;
		
	}
}
