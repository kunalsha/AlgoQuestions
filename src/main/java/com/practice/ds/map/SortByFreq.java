package com.practice.ds.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortByFreq {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(Arrays.asList("abc", "def", "ghi", "def", "ghi", "def", "abc",
				"ghi", "def", "def", "ghi", "abc", "def", "abc", "abc"));
		
		Map<String, Integer> table = new LinkedHashMap<>();
		
		for(String str  :list) {
			if(table.containsKey(str))
				table.put(str, table.get(str)+1);
			else
				table.put(str, 1);
		}
		
		//table.forEach((k,v) -> System.out.println(k + " " + v)); 
		
		List<Map.Entry<String, Integer>> myList =  new ArrayList<>(table.entrySet());
		
		Collections.sort(myList, new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {

				return (Integer)o2.getValue() - (Integer)o1.getValue();
			}
			
		});
		
		System.out.println(myList.get(0));
		
		myList.forEach((val) -> System.out.println(val));
		table.forEach((k,v) -> System.out.println(k + " " + v)); 

		
		
//		Map<String, Integer> sortedMap = table.entrySet()
//			 .stream()
//			 .sorted(Entry.comparingByValue(Comparator.reverseOrder()))
//			 .collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
//	
//		sortedMap.forEach((k,v) -> System.out.println(k + " " + v)); 

	}
}
