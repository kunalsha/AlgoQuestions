package com.practice.interview.IntPrep.array;

import java.util.*;

public class ArrayCombined {

	private int[] arr;

	public static void main(String[] args) {
		System.out.println("Hello Arrays");
		int[] zeroToTen = { 1, 2, 3, 4, 6, 7, 8, 9, 10 };
		findMissingEle(zeroToTen);

		int[] zeroToTenDup = { 1, 2, 3, 4, 4, 7, 8, 9, 10 };
		findDupSet(zeroToTenDup);
		findDupMap(zeroToTenDup);

		int[] unsorted = { 4, 2, 5, 3, 3, 26, 5, 3, 23, 6, 8, 7, 8, 3, 3 };
		int[] unsorted1 = { 4, 7, 4, 8 };

		findLargAndSmallest(unsorted);

		int sum = 11;
		findPairWithSum(unsorted1, sum);
		findPairWithSumOpt(unsorted1, sum);

		int[] output = remove(unsorted, 23);

		for (int value : output)
			System.out.print(value);

		//quickSort(unsorted);

	}

	public static void findMissingEle(int[] intArr) {
		int len = intArr.length;
		int reqNum = (len * (len + 1)) / 2;
		for (int i = 0; i < len; i++)
			reqNum = reqNum - intArr[i];

		System.out.println("Missing number from 0 To 10 is " + Math.abs(reqNum));

	}

	public static void findDupSet(int[] intArr) {
		int len = intArr.length;

		Set<Integer> dupSet = new HashSet<>();

		for (int i = 0; i < len; i++) {
			if (!dupSet.add(intArr[i]))
				System.out.println("Duplicate number in Array is " + intArr[i]);
		}
	}

	public static void findDupMap(int[] intArr) {
		int len = intArr.length;

		Map<Integer, Integer> dupMap = new HashMap<>();

		for (int i = 0; i < len; i++) {
			if (dupMap.containsKey(intArr[i]))
				dupMap.put(intArr[i], (dupMap.get(intArr[i]) + 1));
			else
				dupMap.put(intArr[i], 1);
		}

		dupMap.forEach((k, v) -> {
			if (v > 1)
				System.out.println("Duplicate number in Array is " + k);
		});
	}

	public static void findLargAndSmallest(int[] unsorted) {

		int smallest = unsorted[0], largest = unsorted[0];

		for (int i = 0; i < unsorted.length; i++) {
			if (unsorted[i] > largest)
				largest = unsorted[i];

			if (unsorted[i] < smallest)
				smallest = unsorted[i];

		}

		System.out.println("Largest number in Array is " + largest + " & Smallest is " + smallest);
	}

	public static void findPairWithSum(int[] intArr, int sum) {

		int other = 0;

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < intArr.length; i++)
			map.put(intArr[i], i);

		for (int i = 0; i < intArr.length; i++) {
			other = sum - intArr[i];

			if (map.containsKey(other)) {
				int location = map.get(other);
				System.out.println("Pair co-ordinates are " + i + " & " + location);
			}

		}

	}

	public static void findPairWithSumOpt(int[] intArr, int sum) {

		int left = 0;
		int right = intArr.length - 1;

		Arrays.sort(intArr);

		while (left < right) {
			if (intArr[left] + intArr[right] == sum) {
				System.out.println("Pair is " + left + " " + right);
				left++;
			} else if (intArr[left] + intArr[right] < sum)
				left = left + 1;
			else
				right = right - 1;
		}

	}

	public static int[] remove(int[] numbers, int target) {
		int count = 0;

		// loop over array to count number of target values.
		// this required to calculate length of new array
		for (int number : numbers) {
			if (number == target) {
				count++;
			}
		}

		// if original array doesn't contain number to removed
		// return same array
		if (count == 0) {
			return numbers;
		}

		int[] result = new int[numbers.length - count];
		int index = 0;
		for (int value : numbers) {
			if (value != target) {
				result[index] = value;
				index++;
			}
		}
		numbers = null; // make original array eligible for GC
		return result;
	}

//	public static void quickSort(int[] intArr) {
//
//		int len = intArr.length;
//
//		if (len == 0)
//			return;
//
//		quick(intArr, 0, len - 1);
//	}
//
//	public static void quick(int[] arr, int i, int j) {
//		int low = i;
//		int high = j;
//		int mid = (low + high) / 2;
//
//		int pivot = arr[mid];
//
//		while (low <= high) {
//			while (arr[low] < pivot) {
//				low++;
//			}
//			while (input[high] > pivot) {
//				j--;
//			}
//			if (low <= high) {
//				swap(low, high);
//				low++;
//				high--;
//			}
//		}
//
//		if (low < j) {
//			quickSort(arr, low, j);
//		}
//		if (high > i) {
//			quickSort(arr, i, high);
//		}
//
//	}
//
//	public static void swap(int i, int j) {
//		int temp = input[i];
//		input[i] = input[j];
//		input[j] = temp;
//	}

}

// 4,4,7,8