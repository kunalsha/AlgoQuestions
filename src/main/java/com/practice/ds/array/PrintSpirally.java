package com.practice.ds.array;

public class PrintSpirally {
	public static void main(String[] args) {
		int[][] twoD = {{1,2,3,4}, {5,6,7,8},{9,10,11,12}, {13,14,15,16}};
		
		printSpirally(twoD);
	}

	private static void printSpirally(int[][] twoD) {
		
		int len = twoD.length;
		
		for(int i=0;i<twoD[0].length;i++)
			System.out.println(twoD[0][i]);
		
		
		
	}

}
