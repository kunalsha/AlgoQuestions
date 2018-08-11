package com.practice.interview.IntPrep;

public class TwoDArr {
	public static void main(String[] args) {
		
		int[][] arr = {{12, 14,16,22, 45,56},
				   {12, 14,16,29, 45,56}, 
				   {12, 14,16,34, 45,56}, 
				   {12, 14,17,23, 45,56}, 
				   {1, 14,16,22, 34,56}};
	
		System.out.println(find (arr, 33));
		
	}

	private static boolean find(int[][] arr, int value) {
		
		for (int i=0 ; i< arr.length; i++) {
			
			//traverse each list with binary search
			
			//1. find mid element of list
			//2. check if value is greater/smaller than same
			//3. if smaller, change begin to 0 and end to mid
			//4. if bigger, change begin to mid and end to len
			//5. do untill beging and end is same
			
			int beg = 0;
			int end = arr.length;
			
			while (beg <= end) {
				int mid = (beg + end)/2;
				
				if (arr[i][mid] == value)
					return true;
				else if (arr[i][mid] < value) {
					beg = mid+1;
				}else {
					end = mid-1;
				}
			}
		}
		return false;

		
	}
	
	


}
