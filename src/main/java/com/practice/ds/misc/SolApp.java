package com.practice.ds.misc;

import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class SolApp {

	public static void main(String[] args) {
		reverseNum(3456);
		removeDupString("I have two two entry");
		removeDupHash("I have two two entry");
		permuationString("kunal");

	}


	private static boolean checkBST(Node root) {
		Stack<Node> stack = new Stack<>();
		stack.push(root);
		
		while (!stack.isEmpty()) {
			Node current = stack.pop();
			
			System.out.println(current.data);
			if (current.right != null) {
				stack.push(current.right);
				if (current.right.data < current.data) 
					return false;			
			}
			if (current.left != null) {
				stack.push(current.left);
				if (current.left.data > current.data) 
					return false;
			}
			
			Node parent = current.parent;
			while(parent != null) {
				if(current.data < parent.data) {
					parent = parent.parent;
				}else {
					System.out.println("Problem with node " + current.data);
					return false; 
				}
				
			}
		}
		
		return true;
		
	}

	private static void permuationString(String string) {
		permute("", string);
	}

	private static void permute(String prefix, String string) {
		int n = string.length();
		if (n==0) System.out.println(prefix);
		else {
			for(int i=0;i<n;i++) {
				permute(prefix + string.charAt(i), string.substring(0, i) + string.substring(i+1, n));
			}
		}
	}

	private static void removeDupHash(String string) {
		Map<String, Boolean> dup = new HashMap<>();
		StringBuffer sBuff = new StringBuffer();
		String[] strArr = string.split(" ");
		
		for (String each : strArr) {
			if(!dup.containsKey(each)) {
				dup.put(each, true);
				sBuff = sBuff.append(each).append(" ");
			}
		}
		
		System.out.println(sBuff.toString());

		
	}

	private static void removeDupString(String string) {
		StringBuilder newString = new StringBuilder();
		Set<String> set = new HashSet<>();
		
		String[] strArr = string.split(" ");
		
		for (String str : strArr) {
			if (set.add(str))
				newString = newString.append(str).append(" ");
		}
		System.out.println(newString.toString());
	}

	//3432
	private static void reverseNum(int i) {
		int reverse = 0;
		while (i > 0) {
			int last = i % 10;
			reverse = (reverse * 10) + last;
			i = i /10;
		}
		
		System.out.println(reverse);
	}
	
	@Test
	public void checkBSTTest() {
		Node root = new Node(6, null);
		root.left = new Node(3, root);
		root.right =  new Node(7, root);
		root.left.left = new Node(1, root.left);
		root.left.right = new Node(4, root.left);
			
		System.out.println(checkBST(root));
	}

	@Test
	public void reverseList() {
		LNode root = new LNode(6);
		root.next = new LNode(3);
		root.next.next = new LNode(1);
		root.next.next.next = new LNode(4);
		
		LNode current = root;

//		while(current!=null) {
//			System.out.println(current.data);
//			current = current.next;
//		}
//			
		current = reversetLList(root);
		

	}

	private LNode reversetLList(LNode root) {

		LNode current = root;
		LNode prev = null;
		LNode next = null;
		

		
		while (current != null) {
			next = current.next;
			current.next = prev;
			
			current = next;

			prev = current;

		}		
		
		while(current!=null) {
			System.out.println(current.data);
			current = current.next;	
		}
		
		return current;
		
		
	}
	
}

class Node {
	int data;
	Node left;
	Node right;
	Node parent;
	
	public Node(int data, Node parent) {
		this.data = data;
		this.parent = parent;
	}
}

class LNode {
	int data;
	LNode next;
	
	public LNode(int data) {
		this.data = data;
	}
}