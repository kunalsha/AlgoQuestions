package com.practice.interview.IntPrep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import org.junit.Test;

public class ZipConflict {

	public static ArrayList<ZipCodeRange> process(ArrayList<ZipCodeRange> rangeList) {

		ArrayList<ZipCodeRange> zipList = rangeList;

		Collections.sort(zipList, new Comparator<ZipCodeRange>() {
			@Override
			public int compare(ZipCodeRange o1, ZipCodeRange o2) {
				return o1.getStart() - o2.getStart();
			}
		});
		
		for (int i = 0; i < zipList.size()-1; i++) {
		
			int j = i+1;
			
			int newEnd = 0;	
		
			if(zipList.get(i).getEnd() > zipList.get(j).getStart()) {
				int newStart = zipList.get(i).getStart();
				
				if(zipList.get(i).getEnd() < zipList.get(j).getEnd())
					newEnd = zipList.get(j).getEnd();
				else
					newEnd = zipList.get(i).getEnd();
				
				zipList.set(j, new ZipCodeRange(newStart, newEnd));
				zipList.remove(i);
				i = i-1;
			}
		}

		return zipList;
	}

	@Test
	public void processTest() {

		ArrayList<ZipCodeRange> range = new ArrayList<>();
		range.add(new ZipCodeRange(94133, 94133));
		range.add(new ZipCodeRange(94200, 94299));
		range.add(new ZipCodeRange(94226, 94399));
//		range.add(new ZipCodeRange(30, 35));

		
		for(ZipCodeRange z : process(range))
			System.out.println(z.getStart() + " " + z.getEnd());
		
//		ArrayList<ZipCodeRange> range1 = new ArrayList<>();
//		range1.add(new ZipCodeRange(1, 15));
//		range1.add(new ZipCodeRange(6, 10));
//		range1.add(new ZipCodeRange(12, 18));
//		range1.add(new ZipCodeRange(30, 35));
//
//		System.out.println("New List");
//		for(ZipCodeRange z : process(range1))
//			System.out.println(z.getStart() + " " + z.getEnd());
//		
//		
//		ArrayList<ZipCodeRange> range2 = new ArrayList<>();
//		range2.add(new ZipCodeRange(1, 15));
//		range2.add(new ZipCodeRange(17, 20));
//		range2.add(new ZipCodeRange(12, 18));
//		range2.add(new ZipCodeRange(30, 35));
//
//		System.out.println("New List");
//
//		for(ZipCodeRange z : process(range2))
//			System.out.println(z.getStart() + " " + z.getEnd());

	}

}

class ZipCodeRange {
	private int start;
	private int end;

	public ZipCodeRange(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}
}


