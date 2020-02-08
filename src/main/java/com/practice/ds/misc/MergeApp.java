package com.practice.ds.misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeApp {
	
	public static void main(String[] args) {
		
		List<Integer> l1 = Arrays.asList(12,15,18,21,27,32,45);
		List<Integer> l2 = Arrays.asList(13,17,18,25,29,72,77);
		
		mergeSort(l1, l2);

	}

	private static void mergeSort(List<Integer> l1, List<Integer> l2) {
		
		int len = l1.size() < l2.size() ? l1.size() : l2.size();
		
		List<Integer> result = new ArrayList<>();
		
		int i, j =0;
		
		for(i=0, j=0; i<len;) {
		 	
			if (l1.get(i) <= l2.get(j)) {
				result.add(l1.get(i++));
			} else {
				result.add(l2.get(j++));
			}
		}
		
		if (i >= l1.size()) {
			result.addAll(l2.subList(j, l2.size()));
		} else if (j >= l2.size()) {
			result.addAll(l1.subList(j, l1.size()));
		}

		System.out.println("Sorted list is : ");

		for (Integer value : result)
			System.out.print(value + " ");
	}
	

}
