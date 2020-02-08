package com.practice.ds.situation;

public class OverlappingArea {

	public static void main(String[] args) {
		int[][] rect1 = {{2,1},{5,5}};
		int[][] rect2 = {{3,2},{5,7}};
		
		findArea(rect1);
		findArea(rect1, rect2);

	}

	//2 1
	//5 5
	private static void findArea(int[][] rect1) {
		int width = rect1[1][0] - rect1[0][0];
		int length = rect1[1][1] - rect1[0][1];

		int area = width * length;
		
		System.out.println(area);
		
	}

	
	//int[][] rect1 = {{2,1},{5,5}};
	//int[][] rect2 = {{3,2},{5,7}};
	//                      5,7
	//                      5,5
	//           3,2
	//     2,1   
	
	private static void findArea(int[][] rect1, int[][] rect2) {
		int leftBottom = Math.max(rect1[0][0], rect2[0][0]);
		int rightBottom = Math.min(rect1[1][0], rect2[1][0]);
		int rightTop = Math.max(rect1[1][1], rect2[1][1]);
		int leftTop = Math.min(rect1[0][1], rect2[0][1]);
		
		int width = rightTop - leftTop;
		int length = leftTop - leftBottom;

		int area = width * length;
		
		System.out.println(area);
		
	}

}
