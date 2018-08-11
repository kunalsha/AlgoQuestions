package com.practice.interview.IntPrep;

public class BTreeImpl {
	public static void main(String[] args) {
		BinaryTree bTree = new BinaryTree();
	}

}

class BinaryTree {
	static class Node {
		private int value;
		private Node left;
		private Node right;
		
		public Node(int value) {
			this.value = value;
			this.left = null;
			this.right = null;
		}
	}
	private Node root;
	
	public BinaryTree() {
	}

	public void add(Node n) {
		Node current = root;
		
		if(current==null)
			current = n;
		else {
			if(current.value > n.value) {
				current.left = n;
			}else if(current.value < n.value) {
				current.right = n;
			} else {
				
			}
		}
			
	}
	
	public void printBreadth() {
		Node current = root;
		printRecLeft(root.left);
		//printRecRight(root.right);
	}

	private void printRecLeft(Node left) {
		
	}
}
