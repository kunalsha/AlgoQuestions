package com.practice.interview.IntPrep;

import java.util.Stack;

import org.junit.platform.commons.util.StringUtils;

public class ParanMatch {
	public static void main(String[] args) {
		String paran = "()(())";
		System.out.println("Is it a valid Paranthesis string " + validateParan(paran));
	}

	private static boolean validateParan(String paran) {
		if(null!=paran && StringUtils.isNotBlank(paran)) {
			Stack<Character> charStack = new Stack<>();
			
			for(Character ch : paran.toCharArray()) {
				if(ch.equals('(')) {
					charStack.push('(');
				}else if (ch.equals(')')){
					if(!charStack.empty())
						charStack.pop();
					else 
						return false;
				}else
					System.out.println("Invalid Character");
			}
			
			if(charStack.isEmpty())
				return true;
			else
				return false;
		}
		return false;
	}

}
