/**
 * Write a java program that takes as input a string as a Sentence and return its second word in uppercase.
 * @author Manojh M
 * Date : 06/05/2023
 */

package com.corejavadeepdrive;

import java.util.Scanner;

public class WordUppercase {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		String str = read.nextLine();
		
		String arr[] = str.split(" ");   // Convert string to string array using split method.
		
		if(arr.length<2) 
			System.out.println("LESS");
		else
			System.out.println(arr[1].toUpperCase());  // Change the second word to uppercase.
		read.close();
	}

}
