package com.practice.ds.array;

import java.util.Arrays;
import java.util.Comparator;

public class TwoArray {
	public static void main(String[] args) {
		Integer[] arr1 = { 2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8 };
		Integer[] ref = { 2, 1, 8, 3 };

		sortPerOther(arr1, ref);
	}

	private static void sortPerOther(Integer[] arr1, Integer[] ref) {
		
		
		Arrays.sort(arr1, new CustomComparator());
	}
}

class CustomComparator implements Comparator<Integer> {

	int[] ref = {2, 1, 8, 3};

	@Override
	public int compare(Integer o1, Integer o2) {

		if(findIndex(o1) == -1)
			return o1;
		if(findIndex(o2) == -1)
			return o2;
		if(findIndex(o1) > findIndex(o2))
			return o1;
		else
			return o2;		
	}

	private int findIndex(Integer o1) {
		for (int i=0;i<ref.length;i++) {
			if (o1 == ref[i])
				return i;
			else
				return -1;
		}
		return -1;
	}

}
