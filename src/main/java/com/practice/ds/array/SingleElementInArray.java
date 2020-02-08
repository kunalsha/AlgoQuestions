package com.practice.ds.array;

public class SingleElementInArray {
	public static void main(String[] args) {
		
		int intA[] = {2, 2, 4, 5, 5, 12, 12};
		findSingle(intA);

	}
	
	private static void findSingle(int[] intA) {

		int len = intA.length;
		
		int start = 0, mid = 0, diff = 0;
		int end = len -1;	
		
		while (start < end) {
			mid = (start + end)/2;
			
			if(intA[mid] != intA[mid-1]) {
				if (intA[mid] != intA[mid+1]) {
					diff = intA[mid];
					break;
				}else
					end = mid;
			} else {
				start = mid;
			}
		}
		
		System.out.println(diff);
	}
}
