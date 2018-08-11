package com.practice.interview.IntPrep;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class LargestKSwaps {

	private Object findNew(int time, String num) {

		//1. Create a new HashMap with key as current position and value as new position
		//2. 
		
		int times = time;
		int index = 0;

		char[] charArr = num.toCharArray();
		int[] intArr = new int[charArr.length];
		
		for(int i=0;i<charArr.length;i++) {
			intArr[i] = Integer.parseInt(String.valueOf(charArr[i]));
			System.out.print(intArr[i] + " ");

		}
		
	
		
		for(int i=0;i<times;i++) {
			int maxValue = 0;
			int maxIndx = 0;
			
			for(int j=0;j<intArr.length-1;j++) {
				if(intArr[j] < intArr[j+1]) {
					maxValue = intArr[j+1];
					maxIndx = j+1;
				}
			}
			if(intArr[i] < maxValue) {
				//System.out.print(intArr[i] + " " + maxValue);

				int temp = intArr[i];
				intArr[i] = maxValue;
				intArr[maxIndx] = intArr[i];
			}
		}
		
//		for(int i=0;i<intArr.length;i++)
//			System.out.print(intArr[i]);
		
		return Arrays.toString(intArr);
	}
	
	@Test
	public void Case_Test1() {
		String num = "1234567";
		Assert.assertEquals(7654321, findNew(4, num));
	}
//
//	@Test
//	public void Case_Test2() {
//		String num = "3435335";
//		Assert.assertEquals(5543333, findNew(3, num));
//	}
//	
//	@Test
//	public void Case_Test3() {
//		String num = "1034";
//		Assert.assertEquals(4301, findNew(2, num));
//	}
}


