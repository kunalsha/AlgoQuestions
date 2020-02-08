package com.practice.ds.situation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Life360Demo {
	public static void main(String[] args) {
		List<Circle> circles = Arrays.asList(
				new Circle(101,1),
				new Circle(101,2),
				new Circle(101,4),
				new Circle(102,8),
				new Circle(102,6),
				new Circle(103,4),
				new Circle(103,2));
		
		findDuplicates(circles);
		
	}

	private static void findDuplicates(List<Circle> circles) {
		CustomMap map = new CustomMap();
		circles.forEach(circle -> map.add(circle.id, circle.members));
		map.map.forEach((k,v) -> System.out.println(k + " " + v));
	}
}

class CustomMap {
	public Map<Integer, Integer> map;
	
	public CustomMap() {
		map = new HashMap<>();
	}
	
	public void add(Integer key, Integer value) {
		if(map.containsKey(key)) {
			int currValue = map.get(key);
			if(currValue < value)
				map.put(key, value);
			else
				System.out.println("Duplicate are " + key + " and " + value);
		}else {
			
		}
			map.put(key, value);
	}
}

class Circle {
	public int id;
	public int members;
	
	public Circle(int id, int members) {
		this.id = id;
		this.members = members;
	}
}
