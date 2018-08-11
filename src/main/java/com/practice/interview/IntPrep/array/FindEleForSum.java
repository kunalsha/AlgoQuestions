package com.practice.interview.IntPrep.array;

// 1 2 9 -3 2 5
// 6

public class FindEleForSum {
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 9, -3, 2, 5};
		int sum = 6;
		findEleForSum(arr, sum);
		
	}

	private static void findEleForSum(int[] arr, int sum) {
		int start;
		int end;
		int currSum;
		
		for(int i=0; i<arr.length;i++) {
			currSum = arr[i];
			start = i;

			for(int j=i+1; j<arr.length;j++) {
				currSum = currSum + arr[j];
				
				if(currSum == sum) {
					end = j;
					System.out.println("Current Sum are present on index " + start + " & " + end);
					return;
				}
			}
		}
		System.out.println("Doesnt exist");

	}
}
