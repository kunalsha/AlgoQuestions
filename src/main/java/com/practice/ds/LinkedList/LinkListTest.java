package com.practice.ds.LinkedList;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


class KNode {
	int data;
	KNode next;
	KNode prev;
	
	public KNode(int data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		String str = "Node value is " + data + " next is : " + next + " prev is : " + prev;
		return str;
	}
}

interface KList extends Collection{
	boolean add(KNode n);
	boolean remove(KNode n);
	int size();
	void print();
}

class KListImp implements KList, Serializable, Cloneable{
	private KNode first = new KNode(0);
	private KNode last = null;
	private int size = 0;

	@Override
	public boolean add(KNode n) {
		KNode curr = first;
		
		if(first == null)
			first.next = n;
		else {
			while(curr.next != null) {
				curr = curr.next;
			}
			
			curr.next = n;
			size++;
			System.out.println("Added Node " + n.data + " in list");
		}
		return true;
	}

	@Override
	public boolean remove(KNode n) {
		KNode curr = first;
		if(curr == null)
			return false;
		
		while(curr != null) {
			
			if(curr.data == n.data) {
				if(curr.next == null)
					curr = null;
				else {
					curr.prev.next = curr.next;
					size--;
					System.out.println("Removed Node " + n.data + " in list");
				}
			}
			curr = curr.next;
		}
		
		return true;
	}

	@Override
	public int size() {
		System.out.print("Current Size is " + size +"\n");
		return size;
	}

	@Override
	public void print() {
		KNode curr = first;
		System.out.println();

		while(curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
		System.out.println();

	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray(Object[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(Object e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}
}


public class LinkListTest {
	public static void main(String[] args) {
		
		ArrayList<Integer> aList = new ArrayList<Integer>(Arrays.asList(2,2,3,432,23,23,23,2,23,23,2));
		
		List<Integer> lList = new LinkedList<>(aList);
		
		//lList.forEach(System.out::println);
		
		KList myList = new KListImp();
		myList.size();
		myList.add(new KNode(2));
		myList.add(new KNode(3));
		myList.add(new KNode(26));
		myList.add(new KNode(28));
		myList.add(new KNode(30));

		myList.size();
		myList.print();
		
		myList.remove(new KNode(2));
		myList.remove(new KNode(3));
		myList.remove(new KNode(26));		
		
		myList.size();
		myList.print();


	}
}


