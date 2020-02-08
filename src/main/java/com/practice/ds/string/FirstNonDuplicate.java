package com.practice.ds.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonDuplicate {
	public static void main(String[] args) {
		int[] arr = { 1, 23, 23, 3, 23, 1, 4, 2, 23, 23, 23, 2, 4, 65, 56, 5, 34, 34, 34, 23 };
		firstNonDuplicate(arr);
	}

	private static void firstNonDuplicate(int[] arr) {
		Map<Integer, Integer> valueMap = new LinkedHashMap<>();
		int current = 1;

		for (int value : arr) {
			if (valueMap.containsKey(value)) {
				current = valueMap.get(value);
				valueMap.put(value, current + 1);
			} else
				valueMap.put(value, current);

		}

		valueMap.forEach((k, v) -> System.out.println(k + " " + v));

		for (int i : valueMap.keySet()) {
			if (valueMap.get(i) == 1) {
				System.out.println("First Non duplicate element is " + i);
				break;
			}
		}
	}
}
