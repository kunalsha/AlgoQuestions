package com.practice.ds.LinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LListReview {
	public static void main(String[] args) {
		List<Integer> listInteger = new ArrayList<>();
		listInteger.add(1);
		listInteger.add(2);
		listInteger.add(3);
		listInteger.add(4);
		
		List<Integer> listNew = Collections.synchronizedList(listInteger);
		Object obj = new ArrayList<>();
		
		
		
//		Iterator<Integer> iterator = listInteger.iterator();
//		while(iterator.hasNext()) {
//			Integer intItr = iterator.next();
//			System.out.println(intItr);
//			//iterator.remove();
//			
//		}
		System.out.println("Second Time");
		for(int i : listNew) {
			System.out.println(i);
			listInteger.remove(i);			
		}

	}
}


