package com.practice.ds.theory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class FinalClassEx2 {
	
	public static void main(String[] args) {
		Map<Integer,Integer> hMap = new HashMap<>();
		hMap.put(1,1);
		
		TestClass test = new TestClass(1, "Kunal", hMap);
		System.out.println(test);
		
		hMap.put(2, 3);
		
		Map<Integer,Integer> hMap1 = new HashMap<>();
		hMap1.put(1,1);
		
		TestClass test1 = new TestClass(2, "Sharma", hMap1);
		test = test1;
		
		System.out.println(test);
	}

	

}

final class TestClass {
	
	private int i;
	private String str;
	
	private Map<Integer, Integer> map = new HashMap<>();
	
	public TestClass(int i, String str, Map map) {
		this.i = i;
		this.str = str;
		
		Map<Integer, Integer> tempMap = new HashMap<>();
				
		List<Entry<Integer, Integer>> list = new ArrayList<Entry<Integer, Integer>>(map.entrySet());
		

		for(Map.Entry<Integer, Integer> ent : list)
			tempMap.put(ent.getKey(), ent.getValue());
	}

	public int getI() {
		return i;
	}

	public String getStr() {
		return str;
	}

	public Map<Integer, Integer> getMap() {
		return map;
	}

	@Override
	public String toString() {
		return "TestClass [i=" + i + ", str=" + str + ", map=" + map.size() + "]";
	}	
}