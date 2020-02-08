package com.practice.ds.misc;

public class FebonacciDemo {
	
	public static void main(String[] args) {
		int limit = 20;
		
		if(limit >= 1) System.out.print("0 1 ");
		if(limit >= 2) System.out.print("1 ");
		
		//fibonnaci(1, 1, limit);
		fibonnaciItr(1, 1, limit);

	}

	private static void fibonnaciItr(int i, int j, int limit) {
		
		int sum  = i + j;

		while(sum < limit) {
			System.out.print(sum + " ");
			i = j;
			j = sum;
			sum = i+ j;
		}
	}

	private static void fibonnaci(int i, int j, int limit) {
		int sum = i+j;

		if (sum < limit) {
			System.out.print(sum + " ");
			fibonnaci(j, sum, limit);
		}
		
	}

}
