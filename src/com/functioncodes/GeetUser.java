package com.functioncodes;

import java.util.Scanner;

public class GeetUser {
	
	public static String printMessage(String user) {
		return user;
	}

	public static void main(String[] args) {
		Scanner read  =new Scanner(System.in);
		
		System.out.print("Enter the User name :");
		String user = read.next();
		String name=printMessage(user);
		
		System.out.println("Welcome "+name+" !!!");
		
		read.close();

	}

}
