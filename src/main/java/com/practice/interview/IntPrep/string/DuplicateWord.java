package com.practice.interview.IntPrep.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateWord {
	public static void main(String[] args) {
		String str  = "cat rat cat what bat not what";
		//printDuplicate(str);
		printDupSet(str);
	}

	private static void printDupSet(String str) {
		String[] strArr = str.split(" ");
		Set<String> dupSet = new HashSet<>();
		System.out.println("Non Duplicate words are : ");
		
		for(String strElem : strArr) {
			if(dupSet.add(strElem)==true) {
				System.out.println(strElem);
			}
		}
		
	}

	private static void printDuplicate(String str) {
		String[] strArr = str.split(" ");
		Map<String, Boolean> duplicate = new HashMap<>();
		
		for(String stToken : strArr) {
			if(duplicate.containsKey(stToken)) {
				duplicate.put(stToken, false);
			}else {
				duplicate.put(stToken, true);
			}
		}
		
		//duplicate.forEach((k,v) -> System.out.println(k + " " + v));
		
		Set<Entry<String, Boolean>> setEntry = duplicate.entrySet();
		for(Entry<String, Boolean> e : setEntry) {
			Boolean b = (Boolean)e.getValue();
			if(b==false) {
				System.out.print(e.getKey());
			}
			System.out.println();
		}
	}
}
