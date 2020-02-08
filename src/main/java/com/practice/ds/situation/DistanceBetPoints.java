package com.practice.ds.situation;

public class DistanceBetPoints {
	
	public static void main(String[] args) {
		Points a = new Points(2,2);
		Points b = new Points(3,5);
		
		caluclateDistance(a,b);
	}

	private static void caluclateDistance(Points a, Points b) {
		int result = 0;
		int x = b.getX() - a.getX();
		int y = b.getY() - a.getY();
		
		result = (int) Math.round(Math.sqrt((Math.pow(x, 2)) + (Math.pow(y, 2))));
		
		System.out.println(result);
	}

	
}

class Points {
	private int x;
	private int y;
	
	public Points(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}	
}