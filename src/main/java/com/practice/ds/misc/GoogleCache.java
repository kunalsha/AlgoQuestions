package com.practice.ds.misc;

import java.util.HashMap;
import java.util.Map;

public class GoogleCache {
	public static void main(String[] args) {
		
		String input = "key1, value1, 232, key2, value2, 32, key3, value3, 3232, key4, value4, 2832, key5, value5, 6232, key6, value6, 2, key1, value7, 23";
		
		String[] arr = input.split(", ");
		
		Map<String, CustObj> listCus = new HashMap<>();

		
		
		for (int i=0;i<arr.length;) {
			listCus.put(arr[i], new CustObj(arr[i++], arr[i++], Integer.valueOf(arr[i++])));
		}

		listCus.forEach((k,v) -> System.out.println(k + " " +  v.getValue()+ " " + v.getLatency()));	
		
		//Store In Map(key, value, latency)
	}
}

class CustObj {
	private String key;
	private String value;
	private int latency;	
	
	public CustObj(String key, String value, int latency) {
		super();
		this.key = key;
		this.value = value;
		this.latency = latency;
	}
	
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public int getLatency() {
		return latency;
	}
	public void setLatency(int latency) {
		this.latency = latency;
	}

	@Override
	public String toString() {
		return "CustObj [key=" + key + ", value=" + value + ", latency=" + latency + "]";
	}
}
