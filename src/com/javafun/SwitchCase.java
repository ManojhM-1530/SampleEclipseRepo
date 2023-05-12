/**
 * Check the Seat is available or not 
 * @author MANOJH
 * Date: 25/04/2023
 */

package com.javafun;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Enter the type to be search \n 1.Search by Title \n 2.Search by Language \n 3.Search by Release Date \n 4.Search by Genre \nEnter Your Choice: ");
		int value = read.nextInt();
		
		switch(value) {
			case 1:
				System.out.println("Your search choice is Movie by Title");
				break;
			case 2:
				System.out.println("Your search choice is Movie by Language");
				break;
			case 3:
				System.out.println("Your search choice is Movie by Release Date");
				break;
			case 4:
				System.out.println("Your search choice is Movie by Genre");
				break;
			default:
				System.out.println("Enter valid Choice");
		}
	}

}
