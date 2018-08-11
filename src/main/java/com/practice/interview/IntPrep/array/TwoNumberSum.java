package com.practice.interview.IntPrep.array;

public class TwoNumberSum {
	
	public static void main(String[] args) {
		int[] arr = {2,3,5,6,7, 8,9};
		int[] arr1 = {4,3,9,6,8, 7,9};
		
		twoNumSum(arr, 17);
		twoNumSum2(arr, 17);

		//twoNumSumUnSort(arr1, 17);
	}

	private static void twoNumSum2(int[] arr, int i) {
		int start = 0;
		int end = arr.length-1;
		
		while (start <= end) {
			if(arr[start] + arr[end] == i)
				break;
			else if (arr[start] + arr[end] < i )
				start = start + 1;
			else
				end = end - 1;
		}
		System.out.println("Start is " + start + " and end is " + end);
		
	}

	private static void twoNumSum(int[] arr, int sum) {
		
		int low = 0;
		int high = arr.length-1;
		
		while(low <= high) {
			
			int current = arr[low] + arr[high];
			if( current == sum) {
				System.out.println("Sum numbers at " + low + " & " + high);
				break;
			} else if (current < sum)
				low = low + 1;
			else
				high = high -1;
		}		
	}
}

