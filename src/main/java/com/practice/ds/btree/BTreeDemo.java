package com.practice.ds.btree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BTreeDemo {
	
	int height = 0;
	
	public static void main(String[] args) {
		
		BTNode root = new BTNode(7);
		root.left = new BTNode(5);
		root.right = new BTNode(8);
		root.left.left = new BTNode(4);
		root.left.right = new BTNode(3);
		root.right.left = new BTNode(7);
//		root.right.right = new BTNode(9);
//		root.left.left.left = new BTNode(8);
//		root.left.left.right = new BTNode(9);

		//verticalPrint(root);
		//horizontalPrint(root);
		
		System.out.println("Height of tree is " + findHeight(root));
		System.out.println("Height of tree is " + isBinarySearchTree(root));
	}

	private static boolean isBinarySearchTree(BTNode root) {
		if(root == null) return true;
		
		if(IsLeftSubtreeLesser(root) && IsRightSubtreeGreater(root) && isBinarySearchTree(root.left) && isBinarySearchTree(root.right))
			return true;
		else
			return false;
	}

	private static boolean IsRightSubtreeGreater(BTNode root) {
		if(root == null) return true;
		if((root.data < root.right.data) && IsRightSubtreeGreater(root.right) && IsLeftSubtreeLesser(root.left)) return true;
		else return false;
	}

	private static boolean IsLeftSubtreeLesser(BTNode root) {
		if(root == null) return true;
		
		if((root.data > root.left.data) && IsRightSubtreeGreater(root.right) && IsLeftSubtreeLesser(root.left)) return true;
		else return false;
	}

	private static int findHeight(BTNode root) {
		if (root==null)
			return 0;
		
		BTNode current = root;
		
		int leftHeight = findHeight(current.left);
		int rightHeight = findHeight(current.right);
		
		return Math.max(leftHeight, rightHeight) + 1;

	}

	private static void horizontalPrint(BTNode root) {
		BTNode current = root;
		
		Queue<BTNode> list = new LinkedList<>();
		list.add(current);
		
		while(!list.isEmpty()) {
			current = list.poll();
			System.out.println(current.data);
			if(current.right !=null) list.add(current.right);
			if(current.left !=null) list.add(current.left);
		}
		
		
	}

	private static void verticalPrint(BTNode root) {
		BTNode current = root;
		
		Stack<BTNode> stack = new Stack<>();
		stack.push(current);
		while(stack.size() !=0) {
			current = stack.pop();
			System.out.println(current.data);
			if(current.right !=null) stack.push(current.right);
			if(current.left !=null) stack.push(current.left);
		}
	}
}

class BTNode {
	public int data;
	public BTNode left;
	public BTNode right;
	
	public BTNode(int data) {
		this.data = data;
	}
}