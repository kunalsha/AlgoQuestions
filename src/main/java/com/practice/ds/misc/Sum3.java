package com.practice.ds.misc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sum3 {

	public static void main(String[] args) {
		int[] arr = {-1,0,1,2,-1,-4};
		threeSum(arr);
	}
	
	// x + y + z = 0
	//  z = bal - y
	
	
    public static List<List<Integer>> threeSum(int[] nums) {
        
        int sum = 0;
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        
        for (int i=0;i<nums.length;i++) {
            
            for (int j = i+1; j < nums.length; j++) {
                
                for ( int k = j+1; k<nums.length; k++) {
                	
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> list1 = new ArrayList<>();
                        list1.add(nums[i]);
                        list1.add(nums[j]);
                        list1.add(nums[k]);
                        Collections.sort(list1);
                        if(!list.contains(list1))
                        	list.add(list1);
                    }
                        
                }  
            }          
        }
        
        
        Collections.reverse(list);
        
        for (List<Integer> a : list) {
        	a.forEach((x) -> System.out.print(x));
        	System.out.println();
        }
        return list;
        
        
    }
	
}
