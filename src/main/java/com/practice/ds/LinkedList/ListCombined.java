package com.practice.ds.LinkedList;

import java.util.*;

public class ListCombined {

	Node current = null;
	static int count = 0;

	public static void main(String[] args){
		
		Node root = new Node(0);
		root.next = new Node(4);
		root.next.next = new Node(2);
		root.next.next.next = new Node(14);
		root.next.next.next.next = new Node(2);
		root.next.next.next.next.next = new Node(44);
		root.next.next.next.next.next.next = new Node(3);
	
		printList(root);
		findDuplicate(root);
		System.out.println(findLength(root));
		thirdNodeFromEnd(root);
		midNodeFromEnd(root);

	
	}
	
	public static void printList(Node root) {
		Node current = root;
		
		while(current != null) {
			System.out.println(current.data);
			current = current.next;
		}
		
	}
	
	public static void findDuplicate(Node root){
		Set<Integer> set = new HashSet<>();
		Node current = root;
		
		while(current!= null) {
			int value = current.data;
			if(!set.add(value)){
				System.out.println("Duplicate Node is " + current.data);
			}
			current = current.next;
		
		}
	
	}
	
	public static int findLength(Node n) {
	
		if(n == null)
			return 0;

		return 1 + findLength(n.next);
	
	}
	
	public static void thirdNodeFromEnd(Node root) {
	
		Node current = root;
		int count = 0;
		Node thirdNode = null;
		
		while(current != null) {
			if(count >= 3){
				thirdNode = current;
				break;
			}
			current = current.next;
			count++;	


		}	
		System.out.println("Third Node is " + thirdNode.data);
	}
	
	public static void midNodeFromEnd(Node root) {
	
		Node current = root;
		int count = 0;
		Node midNode = root;
		
		while(current != null) {
			count++;	
			current = current.next;

			if(count%2 == 0){
				midNode = midNode.next;
			}
		}	
		System.out.println("Middle Node is " + midNode.data);
	}
}

//0 4 5 6 6

class Node {

	int data;
	Node next;
	
	public Node(int data){
		this.data = data;
	}

}