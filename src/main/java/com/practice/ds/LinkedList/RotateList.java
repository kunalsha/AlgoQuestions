package com.practice.ds.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class RotateList {

	public static void main(String[] args) {
		NNode head = new NNode(10);
		head.next = new NNode(20);
		head.next.next = new NNode(30);
		head.next.next.next = new NNode(40);
		head.next.next.next.next = new NNode(50);
		
		NNode current = head;

		while(current != null) {
			System.out.println(current.data);
			current = current.next;
		}

		rotateBy(head, 2);
	}

	private static void rotateBy(NNode head, int i) {
		NNode current = head;
		NNode first = head;
		
		int num = i;
		
		while (num > 0) {
			current = current.next;
			num--;
		}
		System.out.println("Current " + current.data);
		
		head = current;

		while(current.next != null)
			current = current.next;
		
		current.next = first;
		
		while(i > 0) {
			current = current.next;
			i--;
		}
		current.next = null;
		
		current = head;
		
		while(head != null) {
			System.out.println(head.data);
			head = head.next;
		}
		
		List<Integer> list = new LinkedList<>();
	}

}

class NNode {
	
	int data;
	NNode next;
	
	public NNode(int data) {
		this.data = data;
	}
}
