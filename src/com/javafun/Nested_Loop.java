/**
 * Check the Seat is available or not 
 * @author MANOJH
 * Date: 25/04/2023
 */

package com.javafun;

public class Nested_Loop {

	public static void main(String[] args) {
		
		for(int i=1;i<=2;i++) {
			System.out.println("Screen "+i+" Available details");
			for(int j=5;j>0;j--) {
				System.out.println("Current Seat Available : "+j);
			}
			System.out.println("Seats Filled in Screen "+i);
		}

	}

}
