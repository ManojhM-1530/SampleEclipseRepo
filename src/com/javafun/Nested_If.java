/**
 * Check the Seat is available or not 
 * @author MANOJH
 * Date: 25/04/2023
 */

package com.javafun;

import java.util.Scanner;

public class Nested_If {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.print("Enter the Username : ");
		String userName = read.next();
		if(userName.equals("Manojh")) {
			System.out.print("Enter the Password : ");
			String password = read.next();
			if(password.equals("123@123")) {
				System.out.print("You have logged in and you can book the ticket now \nEnter the Seat Number :");
				String seatNumber = read.next();
				if(true) {                                                               // Manually entering as seat is available
					System.out.print("Seat Number "+seatNumber+" you have chosen is available");
				}else {
					System.out.println("Seat Number is Not Available");
				}
			}else {
				System.out.println("Enter Valid Password");
			}
		}else {
			System.out.println("Enter Valid UserName");
		}

	}

}
