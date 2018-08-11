package com.practice.interview.IntPrep.string;

import java.util.Arrays;

public class CheckPalindrome {

	public static void main(String[] args) {

		String inValid = "";
		String valid = "abacab";

		System.out.println(checkForPalindrome1(inValid));
		System.out.println(checkForPalindrome1(valid));

		System.out.println(checkForPalindrome2(inValid, 0, inValid.length() - 1));
		System.out.println(checkForPalindrome2(valid, 0, valid.length() - 1));

		makePalindrome(inValid);
		makePalindrome(valid);
		
		longestPalSubstr(inValid);

	}

	static int longestPalSubstr(String str) {
        int n = str.length();   // get length of input string
 
        // table[i][j] will be false if substring str[i..j]
        // is not palindrome.
        // Else table[i][j] will be true
        boolean table[][] = new boolean[n][n];
 
        // All substrings of length 1 are palindromes
        int maxLength = 1;
        for (int i = 0; i < n; ++i)
            table[i][i] = true;
 
        // check for sub-string of length 2.
        int start = 0;
        for (int i = 0; i < n - 1; ++i) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                table[i][i + 1] = true;
                start = i;
                maxLength = 2;
            }
        }
         
        // Check for lengths greater than 2. k is length
        // of substring
        for (int k = 3; k <= n; ++k) {
             
                  // Fix the starting index
            for (int i = 0; i < n - k + 1; ++i) 
            {
                // Get the ending index of substring from
                // starting index i and length k
                int j = i + k - 1;
 
                // checking for sub-string from ith index to
                // jth index iff str.charAt(i+1) to 
                // str.charAt(j-1) is a palindrome
                if (table[i + 1][j - 1] && str.charAt(i) == 
                                          str.charAt(j)) {
                    table[i][j] = true;
 
                    if (k > maxLength) {
                        start = i;
                        maxLength = k;
                    }
                }
            }
        }
        System.out.print("Longest palindrome substring is; ");
        //printSubStr(str, start, start + maxLength - 1);
         
        return maxLength; // return length of LPS
    }
	
	//22452
	//2 245 
	//22 4 22
	//176949671
	//


	private static boolean checkForPalindrome1(String valid) {

		return valid.equalsIgnoreCase(new StringBuilder(valid).reverse().toString());
	}

	private static boolean checkForPalindrome2(String valid, int start, int end) {
		if (valid.length() < 2)
			return true;

		if (valid.charAt(start) != valid.charAt(end))
			return false;

		if (start + 1 <= end - 1)
			checkForPalindrome2(valid, start + 1, end - 1);

		return true;

	}
	
	private static int makePalindrome(String valid) {
		 String comb = valid + "$" + new StringBuilder(valid).reverse().toString();
		 
		 int[] out = computeLPSArray(comb);
		 
		 System.out.println(Arrays.toString(out));

		 return (comb.length() - out.length);
		
		
	}

	// Building LPS vector
	public static int[] computeLPSArray(String str) {

		char[] s = str.toCharArray();
		
		int n = s.length;
		// Initializing LPS vector
		int[] LPS = new int[n];

		int len = 0;
		LPS[0] = 0;

		// from i to n-1
		int i = 1;
		while (i < n) {
			if (s[i] == s[len]) {
				len++;
				LPS[i] = len;
				i++;
			} else // (s[i] != s[len])
			{
				if (len != 0) {
					len = LPS[len - 1];
				} else // if (len == 0)
				{
					LPS[i] = 0;
					i++;
				}
			}
		}
		return LPS;
	}

}

