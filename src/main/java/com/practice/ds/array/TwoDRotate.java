package com.practice.ds.array;

public class TwoDRotate {

	public static void main(String[] args) {

		int[][] twoD = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		
		rotate(twoD);
	}

	private static void rotate(int[][] twoD) {
		int len = twoD[0].length;
		int temp = 0;
		for(int i = 0; i< twoD[0].length;i++) {
			for(int j = 0; j< twoD[0].length;j++) {
					temp  = twoD[i][j];
					twoD[i][j] = twoD[j][len-i];
				
				
				
			}
		}
		
	}

}
