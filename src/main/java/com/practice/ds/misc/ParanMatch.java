package com.practice.ds.misc;

import java.util.Stack;

public class ParanMatch {
	public static void main(String[] args) {
		String paran = "()(())";
		System.out.println("Is it a valid Paranthesis string " + validateParan(paran));
	}

	private static boolean validateParan(String paran) {
		if(null!=paran) {
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
