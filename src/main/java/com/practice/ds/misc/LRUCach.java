package com.practice.ds.misc;

import java.util.HashMap;
import java.util.Map;

public class LRUCach {
	
	private Map<String, Entry> cacheMap;
	Entry start, end;
	private static int limit;
	
	public LRUCach() {
		cacheMap = new HashMap<>(4);
	}
	
	public void putEntry(String key, String value) {

		Entry entry = cacheMap.get(key);

		if(cacheMap.containsKey(key)) {
			cacheMap.put(key, entry);
			removeLR(entry);
			addOnTop(entry);
		}else {
			if(cacheMap.size() > limit) {
				removeLR(end);
				addOnTop(entry);

			} else {
				//cacheMap.put(entry);
				addOnTop(entry);				
			}
		}
	}
	
	public Entry getEntry(String key) {
		Entry entry = null;
		if(cacheMap.containsKey(key)) {
			entry = cacheMap.get(key);
		}
		removeLR(entry);
		addOnTop(entry);
		
		return entry;
	}

	private void addOnTop(Entry entry) {
		Entry current = start;
		
		if(current == null)
			current = entry;
		else {
		}
			
	}

	private void removeLR(Entry entry) {
		// TODO Auto-generated method stub
		
	}
	
	
}

//class Entry {
//	private String key;
//	private String value;
//	private Entry left;
//	private Entry right;
//	
//	public Entry(String key, String value, Entry left, Entry right) {
//		this.key = key;
//		this.value = value;
//		this.left = left;
//		this.right = right;
//	}
//}