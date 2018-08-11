package com.practice.interview.IntPrep.array;

import java.util.LinkedList;

//2,-3,2,-5, 3, 3,2
//

public class ContigousSum {

	public static void main(String[] args) {
		int[] arr = { 2, -3, 2, -5, 3, 3, 2 };
		subArraySum(arr, 7, 6);

	}

	/*
	 * Returns true if the there is a subarray of arr[] with sum equal to 'sum'
	 * otherwise returns false. Also, prints the result
	 */
	static int subArraySum1(int arr[], int n, int sum) {
		int curr_sum, i, j;

		// Pick a starting point
		for (i = 0; i < n; i++) {
			curr_sum = arr[i];

			// try all subarrays starting with 'i'
			for (j = i + 1; j <= n; j++) {
				if (curr_sum == sum) {
					int p = j - 1;
					System.out.println("Sum found between indexes " + i + " and " + p);
					return 1;
				}
				if (curr_sum > sum || j == n)
					break;
				curr_sum = curr_sum + arr[j];
			}
		}

		System.out.println("No subarray found");
		return 0;
	}

	static int subArraySum(int arr[], int n, int sum) {
		
		LinkedList list = new LinkedList();

		int curSum = 0;
		
		for(int i=0;i<n;i++) {
			
			curSum = arr[i];
			
			for(int j=i+1; j<n;j++) {
				curSum += arr[j];
				
				if(curSum == sum) {
					System.out.println("Array indices are " + i + " & " + j);
				}
				
				
			}

			
			
			
			
		}
		
		return 0;
	}
}
