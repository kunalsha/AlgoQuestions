package com.practice.interview.IntPrep.string;

import static org.junit.Assert.assertEquals;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class ReverseWords {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.println(str);
		reverseWord(str);
	}

	public static String reverseWord(String string) {
		String[] words = string.split(" ");
		StringBuffer out = new StringBuffer();
		
		for(int i=words.length-1;i>-1;i--)
			out.append(words[i] + " ");
		return out.toString();
		
	}
}

class TestReverse {
	@Test
	public void reverseWordTest() {
		String reverse = ReverseWords.reverseWord("Who lets the dog out");
		assertEquals(reverse.trim(), "out dog the lets Who");
		
	}
}