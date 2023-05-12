package com.StringMethods;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String s1 = "silent";
		String s2 = "listen";
		char c1[] = s1.toCharArray();
		char c2[] = s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		String n1 = new String(c1);
		String n2 = new String(c2);
		
		if(n1.equals(n2))
			System.out.println("Anagram");
		else
			System.out.println("Not an Anagram");

	}

}
