package com.practice.interview.IntPrep.array;

import java.util.Arrays;

public class NextLargerElement {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 4, 3, 5, 3 };
		int len = arr.length;

		// nextLargerElement(arr);

		printNGE(arr, len);
	}

	private static void nextLargerElement(int[] arr) {

		int len = arr.length;

		int[] result = new int[len];

		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (arr[j] > arr[i]) {
					result[i] = arr[j];
					break;
				}
			}
			if (result[i] == 0)
				result[i] = -1;
		}

		System.out.println(Arrays.toString(result));
	}

	/*
	 * prints element and NGE pair for all elements of arr[] of size n
	 */
	static void printNGE(int arr[], int n) {
		int i = 0;
		stack s = new stack();
		s.top = -1;
		int element, next;

		s.push(arr[0]);

		for (i = 1; i < n; i++) {
			next = arr[i];

			if (s.isEmpty() == false) {
				element = s.pop();
				while (element < next) {
					System.out.println(element + " --> " + next);
					if (s.isEmpty() == true)
						break;
					element = s.pop();
				}
				if (element > next)
					s.push(element);
			}

			s.push(next);
		}

		while (s.isEmpty() == false) {
			element = s.pop();
			next = -1;
			System.out.println(element + " -- " + next);
		}
	}

}

class stack {
	int top;
	int items[] = new int[100];

	// Stack functions to be used by printNGE
	void push(int x) {
		if (top == 99) {
			System.out.println("Stack full");
		} else {
			items[++top] = x;
		}
	}

	int pop() {
		if (top == -1) {
			System.out.println("Underflow error");
			return -1;
		} else {
			int element = items[top];
			top--;
			return element;
		}
	}

	boolean isEmpty() {
		return (top == -1) ? true : false;
	}
}
