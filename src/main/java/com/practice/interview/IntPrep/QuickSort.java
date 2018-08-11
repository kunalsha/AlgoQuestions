package com.practice.interview.IntPrep;

public class QuickSort {
	public static void main(String[] args) {
		int[] arr = {34,23,43,45,23};
		sort(arr);
	}

	private static void sort(int[] list) {
		quicksort(list,0,list.length-1);
	}

	private static void quicksort(int[] list, int stdIndx, int endIndx) {
		int i = stdIndx;
		int j = endIndx;
		
		int pivot = ((stdIndx+endIndx)/2);
		while(i<=j) {
			while(list[i] <list[pivot])
				i++;
			while(list[j] >list[pivot])
				j--;	
			
			if(i<j) {
				int temp = list[i];
				list[i] = list[j];
				list[j] = temp;	
				i++;
				j--;
			}			
		}
	}
}
