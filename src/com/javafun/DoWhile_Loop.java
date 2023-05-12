/**
 * Check the Seat is available or not 
 * @author MANOJH
 * Date: 25/04/2023
 */
package com.javafun;

public class DoWhile_Loop {
	
	public static void main(String[] args) {
		
		int seat=10;
		
		do{
			System.out.println("Current seat Available : "+seat);
			seat--;			
		}while(seat>0);
		System.out.println("Seats are Filled");
	}

}
