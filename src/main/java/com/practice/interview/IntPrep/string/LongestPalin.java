package com.practice.interview.IntPrep.string;

public class LongestPalin {
	public static void main(String[] args) {
		String str = "abcbe";
		System.out.println(longestPalin(str));
	}
	
	public static String longestPalin(String s) {
	    if(s==null || s.length()<=1)
	        return s;
	 
	    int len = s.length();
	    int maxLen = 1;
	    boolean [][] dp = new boolean[len][len];
	 
	    String longest = null;
	    
	    for(int i=0; i<len; i++){
	        for(int j=0; j<len-i; j++){
	        	System.out.println(s.charAt(j) + "==" + s.charAt(i+j));

	            if(s.charAt(j)==s.charAt(i+j) && (i<=2||dp[j+1][i+j-1])){

	                dp[j][i+j]=true;
	 
	                if(i+1>maxLen){
	                   maxLen = i+1; 
	                   longest = s.substring(j, i+j+1);
	                }
	            }
	        }
	    }
	 
	    return longest;
	}
	// a b b d
	// a b c d
	// 0 0 -> 0 and 0 | a a
	// 0 1 -> 1 and 1 | b b
	// 0 2 -> 2 and 2 | a c
	// 1 0 -> 0 and 1 
	// 1 1 -> 1 and 2
	// 1 2 -> 2 and 3
	// 2 0 -> 0 and 2
	// 2 1 -> 1 and 3
	// 2 2 -> 2 and 4
	// 3 0 -> 0 and 3
	// 3 1 -> 1 and 4
	// 3 2 -> 2 and 5
	
	// [i][j]
	// [0,0] [0,1] [0,2]
	// [1,0] [1,1] [1,2]
	// [2,0] [2,1] [2,2]

	//Check for length < 2, Return input
	//Create 2D Boolean to
	// Outer loop till length
	// Inner loop till length-1
	// Check if charAt[j]==charAt[i+j] && i<=2 || dp[j+1][i+j-1]
}
