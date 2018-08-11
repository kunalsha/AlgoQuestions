package com.practice.interview.IntPrep.btree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BreadthFirst {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		
		//breadthFirst(root);
		//depthFirst(root);
		
		preOrder(root);
		//inOrder(root);
		//postOrder(root);
		
	}
	
	//1 -> 2->3->
	//while (current !=null)
	// next = current.next;
	// current.next = prev;
	// prev = current;
	// current = next;
	

	private static void preOrder(TreeNode root) {
		if(root == null)
			return;
		
		System.out.println(root.data);

		preOrder(root.left);
		
		
		preOrder(root.right);
	}

	private static void breadthFirst(TreeNode root) {
		if(root == null)
			return;
		
		TreeNode current = root;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(current);
		
		while(!queue.isEmpty()) {
			current = queue.poll();
			System.out.println(current.data);
			
			if(current.left!=null) queue.add(current.left);
			
			if(current.right!=null) queue.add(current.right);

		}
		
	}
	
	private static void depthFirst(TreeNode root) {
		if(root == null)
			return;
		
		TreeNode current = root;
		Stack<TreeNode> stack = new Stack<>();
		stack.add(current);
		
		while(!stack.isEmpty()) {
			current = stack.pop();
			System.out.println(current.data);
			
			if(current.right!=null) stack.add(current.right);

			if(current.left!=null) stack.add(current.left);
			

		}
		
	}

}

class TreeNode {
	public int data;
	public TreeNode left;
	public TreeNode right;
	
	public TreeNode(int t) {
		this.data = t;
	}
	
}
