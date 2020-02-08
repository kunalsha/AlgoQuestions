package com.practice.ds.LinkedList;

public class ReverseList {

	public static void main (String[] args) {
		Node root = new Node(9);
		root.next = new Node(3);
		root.next.next = new Node(5);
		root.next.next.next = new Node(7);
		root.next.next.next.next = new Node(19);
		root.next.next.next.next.next = new Node(29);
		root.next.next.next.next.next.next = new Node(76);

		print(root);
		//print(reverse(root));

	}

	public static void print(Node root) {
		Node current = root;
		while(current != null) {
			System.out.println(current.data);
			current = current.next;
		}


	}

}
