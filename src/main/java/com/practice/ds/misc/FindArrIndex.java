package com.practice.ds.misc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindArrIndex {
	public static void main(String[] args) {
		int[] intArr = { 23, 2, 2, 23, 43, 23, 26, 45 };
		// findArrIndex(intArr, 66);
		FindArrIndex find = new FindArrIndex();
		Map map = find.createIndxMap(intArr);
		checkSum(map, 47);

	}

	private static void checkSum(Map<Integer, List<Integer>> map, int sum) {
		for (Object num : map.keySet()) {
			int diff = sum - (int) num;

			if (map.containsKey(diff)) {
				System.out.println("Sum 66 on " + map.get(num) + " & " + map.get(diff));
			}

		}

	}

	private Map createIndxMap(int[] intArr) {

		Map<Integer, List<Integer>> indexMap = new HashMap<>();

		for (int num = 0; num < intArr.length; num++) {

			if (indexMap.containsKey(intArr[num])) {
				List<Integer> indexList = (List<Integer>) indexMap.get(intArr[num]);
				indexList.add(num);
				indexMap.put(intArr[num], indexList);
			} else {
				List<Integer> indexList = new ArrayList();
				indexList.add(num);
				indexMap.put(intArr[num], indexList);
			}
		}

		indexMap.forEach((k, v) -> System.out.println(k + " " + v));

		return indexMap;
	}

	private static void findArrIndex(int[] intArr, int value) {
		for (int i = 0; i < intArr.length; i++) {
			for (int j = 1; j < intArr.length - 1; j++) {
				System.out.println("Value of nums are " + intArr[i] + " & " + intArr[j]);
				if (intArr[i] + intArr[j] == value)
					System.out.println("Sum 66 on " + i + " & " + j);
			}

		}
	}
}
