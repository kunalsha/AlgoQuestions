package com.practice.ds.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ChoclateDistri {

	@Test
	public void testCase1() {
		int[] intArr = {3, 4, 1, 9, 56, 7, 9, 12};
		int person = 5;
		Assert.assertEquals(6, findDistri(intArr, person));
		//0 1 -3 8 47 -49 2 3
	}

	@Test
	public void testCase2() {
		int[] intArr = {7, 3, 2, 4, 9, 12, 56};
		int person = 5;
		Assert.assertEquals(6, findDistri(intArr, person));
	}
	
	
	private Object findDistri(int[] intArr, int person) {
		int len = intArr.length;
		int[] intDiff = new int[len];
		
		for(int i=1;i<len;i++)
			intDiff[i] = intArr[i] - intArr[i-1];
		
		Arrays.stream(intDiff).forEach(System.out::println);
		
		
		
		
		
		return null;
	}
}
