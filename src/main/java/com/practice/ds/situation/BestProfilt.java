package com.practice.ds.situation;

import org.junit.Test;

import org.junit.Assert;

public class BestProfilt {
	
	public static void main(String[] args) {
		BestProfilt bestProfilt = new BestProfilt();
		
		int[] stock_prices = {10, 7, 5, 8, 11, 9};
							// 0  -3  -2 3 3 -2

		System.out.println(bestProfilt.get_max_profit(stock_prices));;
	}

	public int get_max_profit(int[] intX) {
		
		int len = intX.length;
		int[] intA = new int[len];
		
		for(int i=1;i<len;i++)
			intA[i] = intX[i] - intX[i-1];

		int start = 0;
		int end = 0;
		int maxSum = 0;
		int curSum = 0;
		
		for(int j=0; j<intA.length-1; j++) {		
			
			curSum = intA[j] + intA[j+1] ;
			
			if(curSum > maxSum) {
				maxSum = curSum ;
				end = j + 1;
			}
				
			if(curSum < 0)
				start++;			
			
		}
		
		System.out.println(start + "  " + end);
		
		return maxSum;
	}
	
	@Test
	public void testCase1() {
		
		int[] stock_prices = {10, 7, 5, 8, 11, 9};
		//0 -3 -2 3 3 -2

		Assert.assertEquals(6, get_max_profit(stock_prices));		
	}

	@Test
	public void testCase2() {
		
		int[] stock_prices = {20, 7, 5, 8, 11, 9};

		Assert.assertEquals(6, get_max_profit(stock_prices));		
	}

	@Test
	public void testCase3() {
		
		int[] stock_prices = {7, 7, 7, 7, 7, 7};

		Assert.assertEquals(0, get_max_profit(stock_prices));		
	}
}
