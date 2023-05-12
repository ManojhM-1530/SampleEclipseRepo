/**
 * Check the Seat is available or not 
 * @author MANOJH
 * Date: 25/04/2023
 */
package com.javafun;
import java.util.*;

public class DecissionMakingSimpleIf {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter the Seat Number: ");
		String seatNumber = sc.next();
		Boolean isAvailabel = true;
		
		if(isAvailabel) {
			System.out.println("You booked the seat Number: "+seatNumber+"\n Enjoy Your Show....");
		}
		sc.close();

	}

}
