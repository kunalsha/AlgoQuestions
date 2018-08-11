package com.practice.interview.IntPrep.string;

import org.junit.platform.commons.util.StringUtils;

public class SplitWoutAndReverse {
	public static void main(String[] args) {
		//String str = "How are you doing,Boss. Do you really like here.";
		String str = "How are";
		splitWoutAndReverse(str);
	}

	private static void splitWoutAndReverse(String str) {
		StringBuilder sBuilder = new StringBuilder(str);
		int start = 0;
		int index = sBuilder.indexOf(" ");
		while(index >=0) {
			System.out.print(sBuilder.substring(start, index)+ " ");
			start = index+1;
			index = sBuilder.indexOf(" ", start);
		}
	}

	private static String reverse(String substring) {
		if(null!=substring && StringUtils.isNotBlank(substring)){
			char[] c = substring.toCharArray();
			StringBuilder sb = new StringBuilder();
			for(int i=c.length-1;i>=0;i--) {
				sb.append(c[i]);
			}
			return sb.toString();
		}
		return "Null String";
	}
}
