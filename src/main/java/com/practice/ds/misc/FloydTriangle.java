package com.practice.ds.misc;

public class FloydTriangle {
	public static void main(String[] args) {
		floydTriangle();
	}

	private static void floydTriangle() {
		int counter = 1;

		for(int i=1;i<10;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(counter++ + " ");
			}
			System.out.println();
		}
	}
}
