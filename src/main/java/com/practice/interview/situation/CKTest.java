package com.practice.interview.situation;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class CKTest {
	
	
	
	private static boolean find(int[][] arr, int value) {

		for (int i = 0; i < arr.length; i++) {
			
			//Binary Sort
			int start = 0;
			int end = arr[i].length-1;
			int mid = 0;
			
			while (start <= end) {
				mid = (start + end)/2;
		
				if(arr[i][mid] == value)
					return true;
				else if(arr[i][mid] > value)
					end = mid-1;
				else
					start = mid+1;	
			}
		}
		return false;
	}
	
	private static int findMinWithSingleOcc(int[] arr) {
		Map<Integer, Integer> data = new HashMap<>();
		
		for (int i : arr)  {
			if(data.containsKey(i)) {
				int value = data.get(i);
				data.put(i, value+1);
			} else {
				data.put(i, 1);
			}
		}
		
		int minKey = 0;
		for (Map.Entry<Integer, Integer> e : data.entrySet()) {
			
			if(e.getKey() < minKey) {
				minKey = e.getKey();
			}
		}
		
			
		
		return 0;
	}
	
	@Test
	public void singleRowIncreasingTest() {
		
		int[][] arr = { { 12, 14, 16, 22, 45, 56 }, 
				{ 12, 14, 16, 29, 45, 56 }, 
				{ 12, 14, 16, 34, 45, 56 },
				{ 13, 14, 17, 23, 45, 56 }, 
				{ 13, 14, 16, 22, 34, 56 } };
		
		System.out.println(find(arr, 343));
	}

	@Test
	public void BothRowIncreasingTest() {
		
		int[][] arr = { { 12, 14, 16, 22, 41, 50 }, 
						{ 13, 15, 17, 24, 42, 53 }, 
						{ 14, 16, 18, 26, 43, 54 },
						{ 15, 17, 19, 28, 44, 57 }, 
						{ 16, 18, 20, 29, 45, 58 } };
				
		System.out.println(find(arr, 343));
	}
	
	@Test
	public void FindMinArrayTest() {
		
		int[]arr = { 12, 14, 16, 22, 41, 50, 14, 16, 18, 26, 43, 54 };
				
		System.out.println(findMinWithSingleOcc(arr));
	}
}
