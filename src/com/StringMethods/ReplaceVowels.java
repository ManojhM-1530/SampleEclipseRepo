package com.StringMethods;

import java.util.Scanner;

public class ReplaceVowels {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String s = read.next();
		s=s.toLowerCase();
		
		System.out.println(s.replaceAll("[aeiouAEIOU]","z"));
	
		
	}

}
