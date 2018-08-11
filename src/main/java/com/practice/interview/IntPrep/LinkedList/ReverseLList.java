package com.practice.interview.IntPrep.LinkedList;

public class ReverseLList {
	public static void main(String[] args) {
		MNNode root = new MNNode(10);
		root.next = new MNNode(20);
		root.next.next = new MNNode(30);
		root.next.next.next = new MNNode(40);
		root.next.next.next.next = new MNNode(50);
		root.next.next.next.next.next = new MNNode(60);
		root.next.next.next.next.next.next = new MNNode(70);
		root.next.next.next.next.next.next.next = new MNNode(80);
		root.next.next.next.next.next.next.next.next = new MNNode(90);

		printList(root);	
		
		MNNode MNNode = null;
		for(int i=0;i<3;i++) {
			if(MNNode ==null)
				MNNode = root;
			MNNode.next = root.next;
		}
		
		int last = 4;
		
		MNNode lastN = root;
		MNNode firstN = root;
		
		int i = 0;
		
		while(root.next==null) {
			if(i%last==0) {
				reverseList(root, lastN);
			} else {
				lastN = root.next;
				i++;
			}
		}
		
		
		//printList();
		
		
	}

	
	//pnull -> 10 -> p20 -> c30
	private static MNNode reverseList(MNNode root, MNNode last) {
		MNNode current = root;
		MNNode prev = null;
		MNNode next = null;
		
		while (current != last) {
			next = current.next;
			current.next = prev;
			
			prev = current;
			current = next;
		}
		return prev;
	}

	private static void printList(MNNode root) {
		System.out.print("\nPrinting List : ");
		while(root!=null) {
			System.out.print(root.data + " ");
			root = root.next;
		}
	}

}

class MNNode {

	int data;
	MNNode next;

	public MNNode(int data) {
		this.data = data;
	}
}