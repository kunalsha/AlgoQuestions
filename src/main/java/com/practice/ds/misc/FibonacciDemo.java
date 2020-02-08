package com.practice.ds.misc;

import java.util.HashMap;
import java.util.Map;

public class FibonacciDemo {
	public static void main(String[] args) {
		FibonacciDemo demo = new FibonacciDemo();
		//demo.printFibonacci(3000);
		//demo.printNth(10);
		//demo.printFibWoutRec(300);
		int limit = 51;
		
		if(limit <= 0)
			System.out.println("Null");
		else if(limit <= 1)
			System.out.println("1");
		else {
			System.out.println("1\n1");
			demo.fibonacci(Math.abs(1),1,limit);
		}
		
		Map<Integer, Integer> dupMap = new HashMap<>();

		for(int i=0;i<i;i++);
	}

	private void fibonacci(int i, int j, int limit) {
		int sum = i + j;
		
		if (sum >= limit) 
			return;
		
		System.out.println(sum + " ");
		fibonacci(j,sum,limit);
		
	}

	private void printFibWoutRec(int limit) {
		if(limit<1)
			System.out.print(0 + " ");
		else if (limit ==1)
			System.out.print(0 + " " + 1 + " ");
		else {
			System.out.print(0 + " " + 1 + " ");
			int sum = 1;
			int i = 0;
			int j =1;
			while(sum < limit) {
				sum = i + j;
				System.out.print(sum + " ");
				i = j;
				j = sum;
				


			}
		}
	}

	private void printNth(int i) {
		
	}

	private void printFibonacci(int limit) {
		if(limit<1)
			System.out.print(0 + " ");
		else if (limit ==1)
			System.out.print(0 + " " + 1 + " ");
		else {
			System.out.print(0 + " " + 1 + " ");
			genFibonacci(0,1,limit);
		}
	}

	private void genFibonacci(int i, int j, int limit) {

		if(i+j >limit)
			return;
		else {
			System.out.print((i+j) + " ");
			genFibonacci(j,i+j,limit);
		}
			

	}

}
