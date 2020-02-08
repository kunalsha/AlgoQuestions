package com.practice.ds.string;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;


public class LongestPrefix {

	public static void main(String[] args) {
		System.out.println(longestPal("apple appdle appnul"));
	}

	private static String longestPal(String string) {

		List<String> al = Arrays.asList(string.split(" "));

		int len = al.size();

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < len; i++) {
			char c = al.get(i).charAt(i);

			for (String str : al) {
				if (str.charAt(i) != c)
					return sb.toString();
			}
			sb = sb.append(c);
		}

		return sb.toString();

	}
	
	@Test
	public void longestPal_Test() {
		assertEquals(longestPal("apple appdle appnul"), "app");
		assertEquals(longestPal("apple appdle appnul"), "app");
		assertEquals(longestPal("apple applde applbnul"), "appl");
		assertEquals(longestPal("papple appdle appnul"), "");

	}

}
