package com.practice.interview.IntPrep.LinkedList;

import com.practice.interview.IntPrep.LinkedList.MyList.Node;

public class ListReverse {
	public static void main(String[] args) {
		MyList<Integer> mylist = new MyList<>();

		mylist.add(new Node(10));
		mylist.add(new Node(20));
		mylist.add(new Node(30));
		mylist.add(new Node(40));
		mylist.print();
		mylist.reverse();
		mylist.print();


		
	}
}

class MyList<E> {
	static class Node {
		int value;
		Node next;
		
		public Node(int value) {
			this.value = value;
		}
	}
	
	static Node head;
	
	public MyList() {
		head = new Node(0);
	}
	
	public void reverse() {
		Node current = head;
		Node prev = null;
		Node next = null;
		
		while (current !=null) {
			next = current.next;
			current.next = prev;
			
			prev =current;
			current = next;
			
		}
		head = prev;
	}

	public void add(Node n) {
		Node current = head;
		while(current !=null) {
			if(current.next==null) {
				current.next = n;
				break;
			}
			current = current.next;
		}
	}
	public void print() {
		Node current = head;
		while(current !=null) {
			System.out.print(current.value + " ");
			current = current.next;
		}
	}


}