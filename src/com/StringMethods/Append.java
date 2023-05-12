package com.StringMethods;

import java.util.Scanner;

public class Append {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		StringBuffer sb = new StringBuffer(read.next());
		
		sb.append('M');  // Append
		
		//sb.insert(2,4,"xxxx");
		
		System.out.println(sb);
		read.close();
	}

}
