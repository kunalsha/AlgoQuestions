package com.practice.interview.IntPrep.btree;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

import com.practice.interview.IntPrep.btree.BinTree.Node;

public class BinaryTreeSum {
	public static void main(String[] args) {
		BinTree tree = new BinTree();
        tree.root = new Node(10);
        tree.root.left = new Node(-2);
        tree.root.right = new Node(6);
        tree.root.left.left = new Node(8);
        tree.root.left.right = new Node(-4);
        tree.root.right.left = new Node(7);
        tree.root.right.right = new Node(5);
        
        tree.printBf(tree.root);
        tree.printDf(tree.root);
        tree.sumOfNode(tree.root);
        tree.printBf(tree.root);


	}
}

class BinTree {
	static class Node {
		int value;
		Node left;
		Node right;
		
		public Node(int value) {
			super();
			this.value = value;
			this.left = null;
			this.right = null;
		}		
	}
	Node root;
	public void printBf(Node root) {
		Deque<Node> dq = new LinkedList<>();
		if(root == null)
			return;
		
		dq.add(root);
		
		while(!dq.isEmpty()) {
			Node n = (Node) dq.remove();
			System.out.println(n.value);
			
			if(n.left!=null)
				dq.add(n.left);
			if(n.right!=null)
				dq.add(n.right);
				
		}
		
		
	}

	public int sumOfNode(Node root) {
		if(root == null)
			return 0;
		
		int oldValue = root.value;
		
		root.value = sumOfNode(root.left) + sumOfNode(root.right);
		
		return oldValue + root.value;
	}

	public void printDf(Node root) {
		Stack<Node> dq = new Stack<>();
		if(root == null)
			return;
		
		dq.push(root);
		
		while(!dq.isEmpty()) {
			Node n = (Node) dq.pop();
			System.out.println(n.value);
			
			if(n.right!=null)
				dq.push(n.right);
			
			if(n.left!=null)
				dq.push(n.left);
				
		}
	}	
}