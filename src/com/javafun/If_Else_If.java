/**
 * Check the Seat is available or not 
 * @author MANOJH
 * Date: 25/04/2023
 */

package com.javafun;
import java.util.*;

public class If_Else_If {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Type of seats Available \n REGULAR \n PREMIUM \n EXCLUSIVE \n VIP");
		System.out.print("Choose any one of the option: ");
		
		String seatType = read.next();
		if(seatType.equals("REGULAR")) {
			System.out.println("You have selected Regular Seat and cost Rs. 70");
		}else if(seatType.equals("PREMIUM")) {
			System.out.println("You have selected Premium Seat and cost Rs. 100");
		}else if(seatType.equals("EXCLUSIVE")) {
			System.out.println("You have selected Exclusive Seat and cost Rs. 150");
		}else if(seatType.equals("VIP")) {
			System.out.println("You have selected VIP Seat and cost Rs. 250");
		}else {
			System.out.println("Enter Valid Seat Type.");
		}
		
		read.close();
	}

}
