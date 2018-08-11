package com.practice.interview.IntPrep.array;

import org.junit.Test;

import junit.framework.Assert;

public class LongestSSeq {

	private int longestSSeq(int[] intArr) {
		//1. Go through Sequence
		//2. Start from first element and with each iteration add next element in the order
		//3. Use start and end index to track if updated sum is bigger than the existing one
		//4. Calculate largest sum
		
		int maxSum =0, currSum = 0, start = 0, end = 0;
		
		for( int i=0;i<intArr.length;i++) {
			currSum = currSum + intArr[i];
			
			if(currSum >= maxSum) maxSum = currSum;
			else end = i -1;
			
			if(currSum < 0 ) {
				start = i + 1;
				currSum = 0;
			}
		}
		return maxSum;
	}
	
	@Test
	public void longestSeq_InBeginning() {
		int[] intArr = {2,3,4,-1,-5,-2,3,4};
		Assert.assertEquals(9, longestSSeq(intArr));	
	}

	@Test
	public void longestSeq_InEnd() {
		int[] intArr = {2,-3,4,-1,-5,-7,3,4};
		Assert.assertEquals(7, longestSSeq(intArr));	
	}
	
	@Test
	public void longestSeq_InMiddle() {
		int[] intArr = {-2,-3,4,1,5,-7,3,-4};
		Assert.assertEquals(10, longestSSeq(intArr));	
	}

	@Test
	public void longestSeq_NullArray() {
		int[] intArr = {};
		Assert.assertEquals(0, longestSSeq(intArr));	
	}
	@Test
	public void longestSeq_SingleDigit() {
		int[] intArr = {2};
		Assert.assertEquals(2, longestSSeq(intArr));	
	}
}
