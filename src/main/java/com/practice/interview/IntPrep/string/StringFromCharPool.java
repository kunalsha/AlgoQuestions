 package com.practice.interview.IntPrep.string;

import java.util.HashMap;
import java.util.Map;

public class StringFromCharPool {

	public static void main(String[] args) {
		StringFromCharPool app = new StringFromCharPool();
		char[] cArr = {'a','b','t','s','e','t'};
		
		System.out.println(app.checkPool(cArr, "absent"));
		
	}

	private String checkPool(char[] cArr, String string) {
		Map<Character, Integer> charPool = new HashMap<>();
		for(char c : cArr) {
			if(charPool.containsKey(c)) {
				charPool.put(c, (charPool.get(c)) + 1);
			}else {
				charPool.put(c, 1);
			}
		}
		
		for(char c : string.toCharArray()) {
			if(charPool.containsKey(c) && charPool.get(c)<=0)
				return "Not possible";
			else
				charPool.put(c,(charPool.get(c)-1));
		}
		return string + " can be formed";

	}
}
