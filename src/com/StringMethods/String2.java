package com.StringMethods;

import java.util.Scanner;

public class String2 {
	
	public static int indexOfCheracterString(String s1,char ch) {
		return(s1.indexOf(ch));
	}
	
	public static boolean indexOfCheracterString2(String s1,String c1) {
		return(s1.contains(c1));
	}

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		String s1 = read.next();
		//char ch = read.next().charAt(0);
		String c1 = "Man";
		
		//int index= indexOfCheracterString(s1,ch);
		boolean index1= indexOfCheracterString2(s1,c1);

		//System.out.println(index >0 ?"Index of "+ch+" is "+ index :"Chracter not Present in the String");
		System.out.println(index1 == true ? index1 :"String not Present in the String");
		

	}

}
