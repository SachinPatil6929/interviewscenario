package com.prowings.interviewscenario.string;

import java.util.Arrays;

public class PalindromeString {
	public static void main(String[] args) {
		String s1 = "Sachin";
		//boolean res;
		s1=s1.toLowerCase();
		System.out.println(s1);
		char[]str1 = s1.toCharArray();
		char[]str2 = new char[str1.length];
		int index = 0;
		for(int i=str1.length-1;i>=0;i--) {
			str2[index++]=str1[i];
		}
		String str3 =Arrays.toString(str1);
		String str4 =Arrays.toString(str2);
		if(str3.equalsIgnoreCase(str4)) {
			System.out.println("It is a palindrome string");
		}
		else {
			System.out.println("It is a not palindrome string");
		}

	}
	
}
