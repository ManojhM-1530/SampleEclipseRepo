/**
y * Write a Java function isAnagram () to check whether the two strings are anagram or not.
 * @author Manojh M
 * Date : 06/05/2023
 */

package com.corejavadeepdrive;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecking {
	
	public static void isAnagram(String s1,String s2) {
		
		char c1[] = s1.toLowerCase().toCharArray();
		char c2[] = s2.toLowerCase().toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		if(new String(c1).equals(new String(c2)))  //Checking for string1 has all character of string2.
			System.out.println("Anagrams");
		else
			System.out.println("Not Anagrams");

	}

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		String string1 = read.nextLine();
		String string2 = read.nextLine();
		
		isAnagram(string1,string2);
		
		read.close();

	}

}
