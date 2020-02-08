package com.practice.ds.array;

import org.junit.Assert;
import org.junit.Test;

public class MergeSortedArray {

	private int[] mergeArray(int[] intA, int[] intB) {

		int lenA = intA.length;
		int lenB = intB.length;

		int[] intRes = new int[lenA + lenB];

		int i = 0, j = 0, k = 0;
		
		while (i < lenA && j < lenB) {
			
			if(intA[i] < intB[j]) intRes[k++] = intA[i++];
			else intRes[k++] = intB[j++];
			
		}
		
		while(i < lenA)
			intRes[k++] = intA[i++];

		while(j < lenB)
			intRes[k++] = intA[j++];
		
		return intRes;
	}

	@Test
	public void validArrays1() {
		int[] intA = { 12 };
		int[] intB = { 2 };
		int[] intRes = { 2, 12 };

		Assert.assertArrayEquals(intRes, mergeArray(intA, intB));
	}

	@Test
	public void validArrays() {
		int[] intA = { 12, 56, 234, 443 };
		int[] intB = { 2, 36, 44, 45 };
		int[] intRes = { 2, 12, 36, 44, 45, 56, 234, 443 };

		Assert.assertArrayEquals(intRes, mergeArray(intA, intB));
	}

	@Test
	public void oneArrayNull() {
		int[] intA = { 12, 56, 234, 443 };
		int[] intB = {};
		int[] intRes = { 12, 56, 234, 443 };

		Assert.assertArrayEquals(intRes, mergeArray(intA, intB));
	}
}
