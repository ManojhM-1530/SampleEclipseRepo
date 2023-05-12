/**
 * Check the Seat is available or not 
 * @author MANOJH
 * Date: 25/04/2023
 */

package com.javafun;

public class ForEach_Loop {

	public static void main(String[] args) {
		
		int[] marks = {125,132,95,116,110};
		int maxSoFar =marks[0];
		
		for(int i:marks) {
			if (i > maxSoFar)
                maxSoFar = i;
		}
		System.out.println(maxSoFar);
		
	}

}
