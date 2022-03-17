package com.prowings.interviewscenario.string;

import java.util.Arrays;

public class AnagramString {
	public static void main(String[] args) {
		String s1 = "abcd";
		String s2 = "dabc";
		Boolean res;
		if (s1.length() == (s2.length())) {
			char[] s1Char = s1.toCharArray();
			char[] s2Char = s2.toCharArray();
			Arrays.sort(s1Char);
			Arrays.sort(s2Char);
			res = Arrays.equals(s1Char, s2Char);
			if (res) {
				System.out.println(s1 + " and " + s2 + " are anagram string");
			} else {
				System.out.println(s1 + " and " + s2 + " are not anagram string");
			}

		}
	}

}
