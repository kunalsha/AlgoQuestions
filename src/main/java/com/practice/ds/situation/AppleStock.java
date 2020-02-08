package com.practice.ds.situation;

import java.util.Arrays;

public class AppleStock {
	
	public static void main(String[] args) {
		  int[] stock_prices = {10, 7, 5, 8, 11, 9};

		  System.out.println(get_max_profit(stock_prices));
		  //Returns 6 (buying for $5 and selling for $11)
	}

	private static int get_max_profit(int[] stock_prices) {
		
		//Create an array with differences between two days
		//0 -3 -2 3 3 -2
		
		int len = stock_prices.length;
		
		int[] result = new int[len];
		for (int i=1;i<len;i++)
			result[i] = stock_prices[i] - stock_prices[i-1];
		
		System.out.println(Arrays.toString(result));
		//Find a contigous span with maximum sum
		
		int start = 0, end = 0;
		int curSum = 0 , maxSum = 0;
		
		
		for (int i=0;i<len;i++) {
			curSum = curSum + result[i];
			
			if(curSum > maxSum) {
				maxSum = curSum;
				end++;
			}
			
			if(curSum < 0) {
				curSum = 0;
				start = i+1;
				end = i+1;
			}
		}

		System.out.println("MaxSum is " + maxSum + " & Start is " +  (start-1) + " & end is " + (end-1));
		return maxSum;
		
	}

}
