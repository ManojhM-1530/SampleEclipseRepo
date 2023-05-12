package com.StringMethods;

public class ReverseInString {
	public static void main(String[] args) {
		
		char s1[] = {'a','b','b','a'};
		String s = new String(s1);
		StringBuffer sb = new StringBuffer(s);
		String s2  = sb.toString();
		
		sb.reverse();
			
		if(s2.equals(s))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
		
	}
}
