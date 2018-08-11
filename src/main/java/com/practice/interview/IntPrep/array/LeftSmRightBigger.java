package com.practice.interview.IntPrep.array;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

public class LeftSmRightBigger {

	@Test
	public void testCase1() {
		int[] intArr = {4, 2, 5, 7};//0 -2 3 2 
		Assert.assertEquals(5, findFirstEle(intArr));
	}
	
	@Test
	public void testCase2() {
		int[] intArr = {11, 9, 12}; //0 -2 3
		Assert.assertEquals(-1, findFirstEle(intArr));
	}
	
	@Test
	public void testCase3() {
		int[] intArr = {4, 3, 2, 7, 8, 9}; //0 -1 -1 5 1 2 // 0 -1 -2 3 4 6 
		Assert.assertEquals(7, findFirstEle(intArr));
	}

	private int findFirstEle(int[] intArr) {

		int[] intDiff = new int[intArr.length];
		
		for(int i=1;i<intArr.length;i++)
			intDiff[i] = intArr[i] - intArr[i-1];
		
		Arrays.stream(intDiff).forEach(System.out::println);
		
		int elemRes = -1;
		
		for(int i=0;i<intDiff.length;i++) {
			if(i+1 < intDiff.length) {
				if(intDiff[i] > 0 && intDiff[i+1] > 0) {
					elemRes = intArr[i];
					break;
				}
				
			}
		}
			
		return elemRes;
	}
}
