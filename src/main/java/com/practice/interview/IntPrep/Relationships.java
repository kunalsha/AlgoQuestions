package com.practice.interview.IntPrep;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Relationships {

	public static void main(String[] args) {

		int[][] par = new int[][] { { 1, 3 }, { 2, 3 }, { 3, 6 }, { 5, 6 }, { 5, 7 }, { 4, 5 }, { 4, 8 }, { 8, 9 } };
		
		Set<Integer> parList = new HashSet<>();
		Set<Integer> childList = new HashSet<>();

		for (int i=0;i<par.length;i++) {
			parList.add(par[i][0]);
			childList.add(par[i][1]);	
		}
		
		int[] zeroP = new int[par.length];
		int a = 0;
		
		for(Integer in : parList) {
			if(!childList.contains(in))
				zeroP[a++] = in;
		}

		System.out.println(Arrays.toString(zeroP));
		
		
	}
}
