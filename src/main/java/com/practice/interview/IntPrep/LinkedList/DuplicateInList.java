package com.practice.interview.IntPrep.LinkedList;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;

import org.junit.Test;

import junit.framework.Assert;

public class DuplicateInList {

	private Object findDup(int[] intA) {

		Map<Integer, Integer> dupMap = new HashMap<>();

		for (int i = 0; i < intA.length; i++) {
			if (dupMap.containsKey(intA[i]))
				dupMap.put(intA[i], dupMap.get(intA[i]) + 1);
			else
				dupMap.put(intA[i], 1);
		}

		dupMap.forEach((k, v) -> System.out.println(k + " " + v));

		Optional<Entry<Integer, Integer>> i = dupMap.entrySet()
			  .stream()
			  .filter(val -> val.getValue()==2).findFirst();
		

		System.out.println("Duplicate is there " + i.get().getKey());
		
		Set<Integer> dupSet = new HashSet<>();
		
		int dup = 0;
		
		for (int j = 0; j < intA.length; j++) {
			if(dupSet.add(intA[j])==false)
				dup = intA[j];
		}
		
		
		return dup;
	}

	@Test
	public void test1() {
		int[] intA = { 2, 12, 36, 44, 45, 56, 234, 36 };

		Assert.assertEquals(36, findDup(intA));

	}

}
