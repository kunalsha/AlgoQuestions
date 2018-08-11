package com.practice.interview.IntPrep.LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MiddleList {
	public static void main(String[] args) {
		List<Integer> listInt = new LinkedList<>(Arrays.asList(23,24,24,2,23,21,4,5,3,234,23,23));
		middleElement(listInt);
	}

	private static void middleElement(List<Integer> listInt) {
		int middle = 0;
		for(int i=0;i<listInt.size();i++) {
			if(i%2==0) {
				middle++;
			}
		}
		System.out.println("Middle element is " + listInt.get(middle));
	}
}
