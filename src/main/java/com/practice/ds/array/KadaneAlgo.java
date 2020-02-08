package com.practice.ds.array;


//2 3 -2 3 -2 2 -1
//0 1  2 3  4 5  6
//maxSum
//currSum

public class KadaneAlgo {
	public static void main(String[] args) {
		int[] arr  = {2,-3,2,-5, 3, 3,2};
		int[] arr2 = {2,3,2,-1, -3, -3,2};
		largestSum(arr2);
	}

	private static void largestSum(int[] arr) {
		int maxSum = 0;
		int currSum = 0;
		int start = 0;
		int end = 0;
		
		for (int i=0;i<arr.length;i++) {
			currSum = currSum + arr[i];
			
			if(maxSum < currSum) {
				maxSum = currSum;
				end = i;
			}
			
			if(currSum < 0) { 
				currSum = 0;
				start = i+1;
			}
				
		}
		System.out.println("MaxSum " + maxSum + " And Coordinates are " + start + " & " + end);

	}
}
