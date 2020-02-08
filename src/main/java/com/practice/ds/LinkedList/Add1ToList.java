package com.practice.ds.LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Add1ToList {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(1,34,12,12,43,45,34,23,23));
		
		list.forEach(System.out::println);
		add1ToList(list);
		list.forEach(System.out::println);
	}

	private static void add1ToList(List<Integer> list) {
		for(int i=0;i<list.size();i++) {
			list.set(i, list.get(i)+1);
		}
			
	}
}
