package com.practice.interview.IntPrep.array;

import java.util.Collections;
import static java.util.stream.Collectors.*;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SortByFreq {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 2, 23, 34, 23, 23, 23, 4, 4, 23, 23, 22, 25, 5, 24, 23, 23, 64, 545, 45, 34 };
		sortByFreq(arr);

	}

	private static void sortByFreq(int[] arr) {
		Map<Integer, Integer> freq = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			int currVal = 1;

			if (freq.containsKey(arr[i])) {
				currVal = freq.get(arr[i]);
				freq.put(arr[i], currVal + 1);
			} else {
				freq.put(arr[i], currVal);
			}
		}
		
		freq.forEach((k,v) -> System.out.println(k + " " + v)); 		
		Map<Integer, Integer> freqSort = new TreeMap<>(freq);
		
		//freqSort.forEach((k,v) -> System.out.println(k + " " + v));
		
		
		Map<Integer, Integer> freqSortDesc = new TreeMap<Integer, Integer>(
				new Comparator<Integer>() {
			
			@Override
			public int compare(Integer i, Integer j) {
				return i - j;
			}
			
		});
		
		freqSortDesc.putAll(freq);
		  
		//freqSortDesc.forEach((k,v) -> System.out.println(k + " " + v));
		
		List<Map.Entry<Integer, Integer>> list = new LinkedList<>(freq.entrySet());
		
		Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {

			@Override
			public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
				return o2.getValue() - o1.getValue();
			}
			
		});

		Map<Integer, Integer> freqSortValue = new LinkedHashMap<>();

		for(Map.Entry entry : list)
			freqSortValue.put((Integer)entry.getKey(), (Integer)entry.getValue());
				  
		//freqSortValue.forEach((k,v) -> System.out.println(k + " " + v));
		
		Map<Integer, Integer> sortedByValue = freq.entrySet()
												 .stream()
												 .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
												 .collect(
												 toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));



		sortedByValue.forEach((k,v) -> System.out.println(k + " %" + v));


	}
	
//	private static void sortByFreq(int[] arr) {
//		Map<Integer, Integer> freq = new TreeMap<>();
//
//		for (int i = 0; i < arr.length; i++) {
//			int currVal = 1;
//
//			if (freq.containsKey(arr[i])) {
//				currVal = freq.get(arr[i]);
//				freq.put(arr[i], currVal + 1);
//			} else {
//				freq.put(arr[i], currVal);
//			}
//		}
//		
//		int maxKey = 0;
//		int maxValue = 0;
//		
//		for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
//			if(entry.getValue() > maxValue)  {
//				maxKey = entry.getKey();
//				maxValue = entry.getValue();
//			}
//			
//		}
//		
//		System.out.println("Max key is " + maxKey + " and Max Value is " + maxValue);
//	}
}
