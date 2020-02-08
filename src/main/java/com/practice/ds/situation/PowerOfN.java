package com.practice.ds.situation;

public class PowerOfN {

	public static void main(String[] args) {
		int num = 5;
		int power  =  4;
		
		findPower(num, power);
	}

	private static void findPower(int num, int power) {
		int result = 1;
		for (int i=0;i<power;i++) {
			result = result * num;
		}
		
		System.out.println(result);
	}

}
