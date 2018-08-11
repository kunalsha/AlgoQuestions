package com.practice.interview.IntPrep.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JavaStreams {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 2, 23, 2, 2, 23, 22, 2, 2123, 4, 4, 332));

		List<Integer> newList = list.stream().filter(x -> x % 2 == 0).map(x -> x * 2).collect(Collectors.toList());

		// newList.forEach(x -> System.out.println(x));

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		map.put(4, "d");
		map.put(5, "e");

		String result = map.entrySet()
						   .stream()
						   .filter(x -> "a".equals(x.getValue()) || "b".equals(x.getValue()))
						   .map(x -> x.getValue())
						   .collect(Collectors.joining(" , "));
		System.out.println(result);
	}

}
