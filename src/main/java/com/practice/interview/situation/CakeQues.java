package com.practice.interview.situation;

import java.util.*;

//   cake_tuples = [(7, 160), (3, 90), (2, 15)]
// capacity    = 20
// 
// # Returns 555 (6 of the middle type of cake and 1 of the last type of cake)
// max_duffel_bag_value(cake_tuples, capacity)

public class CakeQues {
	
	public static int max_duffel_bag_value(int[][] cake_tuples, int capacity) {
		
		List<Tuple> li = new ArrayList<>();
		
		for (int i=0; i< cake_tuples.length; i++) {
			double pQuan = (double) cake_tuples[i][1]/cake_tuples[i][0];
			li.add(new Tuple(cake_tuples[i][0], cake_tuples[i][1], pQuan));		
		}
		
		li.sort((t1, t2) -> (int) Math.round(t2.getPQuan() - t1.getPQuan()));
		
		int currQuantity = capacity;
		int finalValue = 0;

		
		for (Tuple t : li) {
			if(currQuantity > t.getQuantity()) {			
				finalValue += t.getPrice();
				currQuantity -= t.getQuantity();
			}		
		}
		
		//li.forEach(System.out::println);
		
		return finalValue;
	}	

	public static void main (String[] args) {
		int[][] cake_tuples = {{7, 160}, {3, 90}, {2, 15},{5, 12}, {3, 30}, {6, 55}};
		int capacity = 0;
		
		if (capacity <=0)
			System.out.println("Duffle Bag final price is 0 ");
		else 
			System.out.println("Duffle Bag capacity is " + max_duffel_bag_value(cake_tuples, capacity));

	}

}

class Tuple {
	private int quantity;
	private int price;
	private double pQuan;
	
	public Tuple (int a , int b , double c) {
		this.quantity = a;
		this.price = b;
		this.pQuan = c;	
	}
	
	public double getPQuan(){
		return pQuan;
	}
	
	public double getQuantity(){
		return quantity;
	}
	
	public double getPrice(){
		return price;
	}
	
	public String toString() {
		return "Value of tuple is " + quantity + " & " + price + " & " + pQuan;
	}
}












