package com.StringMethods;

public class ArrayOfString {

	public static void main(String[] args) {
		
		String s1 = "Hii this is Manojh MT";
		String s2[] = s1.split(" ");
		
		for(int i=0;i<s2.length;i++)
			System.out.println(i+" : "+s2[i]);
	}

}
