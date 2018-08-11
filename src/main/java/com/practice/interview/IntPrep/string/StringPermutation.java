package com.practice.interview.IntPrep.string;

import org.junit.Test;

import junit.framework.Assert;

public class StringPermutation {
	
	int count = 0;


	private int stringPermute(String input) {
		
		int combination = permuteRec("", input);
		
		System.out.println("Count " + combination);

		return combination;
	}
	
	
	private int permuteRec(String prefix, String input) {
		if(input.length() == 0) {
			System.out.println(prefix);
			count++;
		}
		
		for(int i=0;i<input.length();i++) {
			permuteRec(prefix + input.charAt(i), input.substring(0, i) + input.substring(i+1, input.length()));
		}
		return count;
	}


	@Test
	public void permutation_test1() {
		String input = "abc";
		Assert.assertEquals(6, stringPermute(input));
	}

	@Test
	public void permutation_test2() {
		String input = "a";
		Assert.assertEquals(1, stringPermute(input));
	}

	@Test
	public void permutation_test3() {
		String input = "abb";
		Assert.assertEquals(6, stringPermute(input));
	}
}
