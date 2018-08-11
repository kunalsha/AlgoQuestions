package com.practice.interview.IntPrep.LinkedList;

import java.util.*;

public class ReverseList {	

	public static void main (String[] args) {
		Node root = new Node(9);
		root.next = new Node(3);
		root.next.next = new Node(5);
		root.next.next.next = new Node(7);
		root.next.next.next.next = new Node(19);
		root.next.next.next.next.next = new Node(29);
		root.next.next.next.next.next.next = new Node(76);

		//print(root);
		//print(reverse(root));

	}
}
	
	//1 -> 2 -> 3 -> 4
//	
//	public static Node reverse(Node root) {
//		
//		Node cur = root;
//		Node pre = null;
//		Node nex = null;
//		
//		while (cur != null) {
//			nex = cur.next;
//			cur.next = pre;
//			pre = cur;
//			cur = nex;
//		}
//				
//		return pre;
//	}
	
//	public static void print(Node n) {
//		while(n != null) {
//			System.out.println(n.getData());
//			n = n.next;
//
//		}	
//	}
//
//}

//class Node {
//	public int data;
//	public Node next;
//	
//	public Node (int data) {
//		this.data = data;
//	}
//	
//	public int getData() {
//		return data;
//	}
//	
//	public String toString() {
//		return "Node value is " + data;
//	}
//}












