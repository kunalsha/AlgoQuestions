package com.practice.interview.IntPrep.LinkedList;

import java.util.HashSet;
import java.util.Set;

public class DetectLoop {
	public static void main(String[] args) {
		Nod root = new Nod(1);
		root.next = new Nod(3);
		root.next.next = new Nod(6);
		root.next.next.next = new Nod(8);
		//root.next.next.next.next = root.next;

		//print(root);
		
		//print(detectLoop(root));
		
		Nod root1 = new Nod(2);
		root1.next = new Nod(4);
		root1.next.next = new Nod(6);
		
		print(mergeList(root, root1));
	}

	private static Nod mergeList(Nod root, Nod root1) {
		Nod fin = new Nod(0);
		Nod finRoot = fin;
		
		Nod first = root;
		Nod second = root1;
		
		
		while(first!=null && second!=null) {
			if(first.data <= second.data) {
				fin.next = new Nod(first.data);
				first = first.next;
			} else {
				fin.next = new Nod(second.data);
				second = second.next;
			}
			fin = fin.next;

		}
		
		if(first != null)
			fin.next = first;
		
		if(second != null)
			fin.next = second;
		
		return finRoot;	
	}

	private static Nod detectLoop(Nod root) {
		Set<Nod> nodeSet =  new HashSet<>();
		
		Nod current = root;
		nodeSet.add(current);
		while(current != null) {
			if(!nodeSet.add(current.next)) {
				System.out.println("Loop exists in the node");
				current.next = null;
				break;
			}
			System.out.println("Current node" + current.data);

			current = current.next;
		}
		return root;
	}

	private static void print(Nod root) {
		Nod current = root;
		while(current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}

}

class Nod {
	public int data;
	Nod next;
	
	public Nod(int data) {
		this.data = data;
	}
}
