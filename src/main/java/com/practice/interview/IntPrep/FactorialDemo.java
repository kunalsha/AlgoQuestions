package com.practice.interview.IntPrep;

public class FactorialDemo {
	int factorial(int n) {
		if (n == 0)
			return 1;
		else
			return (n * factorial(n - 1));
	}

	public static void main(String args[]) {
		FactorialDemo demo = new FactorialDemo();
		int fact = demo.factorial(5);
		System.out.println("Factorial of 30" + " is: " + fact);
	}
}
