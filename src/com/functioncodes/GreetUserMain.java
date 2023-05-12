package com.functioncodes;

import java.util.Scanner;
import com.demo.GreetUser1;

//class GreetUser2{
//	public static String printMessage(String user) {
//		return user;
//	}
//}

public class GreetUserMain {

	public static void main(String[] args) {
		Scanner read  =new Scanner(System.in);
		
		System.out.print("Enter the User name :");
		String user = read.next();
		String name=GreetUser1.printMessage(user);
		
		System.out.println("Welcome "+name+" !!!");
		
		read.close();

	}

}
