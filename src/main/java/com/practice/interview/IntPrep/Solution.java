package com.practice.interview.IntPrep;

public class Solution {
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] nums = {0,1,2,2,2,3};
		int len = sol.removeDuplicates(nums);
	    System.out.println("Reached here");

		for (int i = 0; i < len; i++) {
		    System.out.println(nums[i]);
		}
	}
	
	// Count the number of unique elements
	// {0,1,1,1,2,2,3,4,4,5,5}
	// {0,1,2,2,2,3,4,4,5,5}
	
	public static int countUnique(int[] A) {
		int count = 0;
		for (int i = 0; i < A.length - 1; i++) {
			if (A[i] == A[i + 1]) {
				count++;
			}
		}
		return (A.length - count);
	}
	
    public int removeDuplicates(int[] arr) {
    	int retLen = arr.length;
    	
    	for (int i = 0; i<arr.length-1;i++) {
    		if(arr[i] == arr[i+1]) {
    			int j = i;
    			while((i+j <= arr.length-1) && (arr[i] == arr[i + j])) {
    				j++;

    			}
    			
    			if(j+1 < arr.length) {
    				arr[i+1] = arr[j+1];
        			retLen--;
    			} else {
        			retLen--;
    			}
    			
    		}    		
    	}
    	return retLen;

    }

}