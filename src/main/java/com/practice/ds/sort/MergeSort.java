package com.practice.ds.sort;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		int[] arr = { 23, 53, 23, 5, 66, 4, 22, 8, 45, 6, 6 };

		mergeSort(arr);
		Arrays.toString(arr);
	}

	private static int[] mergeSort(int[] arr) {

		int mid = arr.length - 1;

		if (arr.length == 1)
			return arr;

		int[] arr1 = mergeSort(arr);
		int[] arr2 = mergeSort(arr);

		return merge(arr1, arr2);
	}

	private static int[] merge(int[] arr1, int[] arr2) {
		
		int len1 = arr1.length;
		int len2 = arr2.length;
		
		int[] result = new int[len1+ len2];
		
		int min = Math.min(len1, len2);
		int i = 0, j = 0;
		while(i <= len1 && i <=len2) {
		}
		
		
		
		
		
		
		return arr2;
		
	}
}
