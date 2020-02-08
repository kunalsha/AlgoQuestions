package com.practice.ds.sort;

import java.util.Arrays;

class Solution {

	public static void main(String[] args) {
		// Initializing array
		int arr[] = { 9, 4, 8, 3, 1, 2, 5 };
		System.out.println("Initial " + Arrays.toString(arr));

		quickSort(arr, 0, arr.length - 1);
		System.out.println("Final " + Arrays.toString(arr));
	}

	private static void quickSort(int[] arr, int i, int j) {
		if (i < j) {
			int pos = partition(arr, i, j);
			quickSort(arr, 0, pos - 1);
			quickSort(arr, pos + 1, j);
		}
	}

	private static int partition(int[] arr, int min, int max) {

		int pivot = arr[max];
		int i = min - 1;
		for (int k = min; k < max; k++) {
			if (arr[k] < pivot) {
				i++;

				swap(arr, k, i);
			}
		}

		swap(arr, max, i + 1);
		return i + 1;
	}

	private static void swap(int[] arr, int i, int k) {
		int temp = arr[i];
		arr[i] = arr[k];
		arr[k] = temp;
	}

}