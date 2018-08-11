package com.practice.interview.IntPrep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SIPNew {
	public static void main(String[] args) {
        Map<Integer,String> ipRange= new TreeMap<Integer,String>();

        ipRange.put(1, "10.1.4.100");
        ipRange.put(2, "1.10.400.10");
        ipRange.put(3, "196.0.14.15");
        ipRange.put(4, "196.70.5.1");
        ipRange.put(5, "196.70.7.3");
        ipRange.put(6, "153.70.7.0");
        
        sortIP(ipRange);
	}

	private static void sortIP(Map<Integer, String> ipRange) {
		
		List<String> list = new ArrayList<>();
		list.addAll(ipRange.values());

		for (String obj : list)
			System.out.println(obj.toString());
		
		
		Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				String[] group1 = o1.split("\\.");
				String[] group2 = o2.split("\\.");
				
				for(int i=0;i<group1.length;i++) {
				}

				return 0;
			}
			
		});
	}
}
