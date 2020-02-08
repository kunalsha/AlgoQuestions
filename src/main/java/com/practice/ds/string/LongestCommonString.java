package com.practice.ds.string;

public class LongestCommonString {

    /**
     * Dynamic way of calculating lcs
     */
    public int longestCommonSubstring(char str1[], char str2[]){
    	int[][] dynArr = new int[str1.length+1][str2.length+1];
    	int max = 0 ;
    	
    	for(int i=1;i<=str1.length;i++) {
        	for(int j=1;j<=str2.length;j++) {
        		if(str1[i-1] == str2[j-1]) {
        			dynArr[i][j] = dynArr[i-1][j-1] + 1;
        			if(max < dynArr[i][j])
        				max = dynArr[i][j];
        		}
        	}
    	}
    	return max;
    }
  
        
    
    public static void main(String args[]){
    	LongestCommonString lcs = new LongestCommonString();
        char str1[] = "abcdef".toCharArray();
        char str2[] = "zcdemf".toCharArray();
        System.out.println(lcs.longestCommonSubstring(str1, str2));
    }
    
}

////a b c d e f
//z 0 0 0 0 0 0
//c 0 0 1 0 0 0
//d 0 0 0 2 0 0 
//e 0 0 0 0 3 0
//m 0 0 0 0 0 0
//f 0 0 0 0 0 0
