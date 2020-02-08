package com.practice.ds.btree;

import java.util.Stack;

public class SecondLargestBST {
	public static void main(String[] args) {
		
		BNode root = new BNode(10);
		root.left = new BNode(8);
		root.right = new BNode(12);
		root.left.left =new BNode(4);
		root.left.right = new BNode(9);
		root.right.left = new BNode(11);
		root.right.right = new BNode(16);
		
		System.out.println(findSecondLargest(root).data);
		
		
	}

	private static BNode findSecondLargest(BNode root) {
		
		Stack<BNode> stack = new Stack<>();
		stack.push(root);
		BNode second = null;
		
		while (!stack.isEmpty()) {
			BNode current = stack.pop();


			//if(current.left != null) stack.push(current.left);
			if(current.right != null) {
				stack.push(current.right);
				if(current.right.right == null)
					second = current.right;
			}
		}	
		return second;
		
	}

}

class BNode {
	int data;
	BNode left;
	BNode right;
	
	public BNode(int data) {
		this.data = data;
	}	
}

//          10
//      8       12
//   4    9  11     16 