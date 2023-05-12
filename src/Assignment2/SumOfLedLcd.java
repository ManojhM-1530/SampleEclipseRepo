/**
 * A factory manufactured LED bulbs on the first day. On the second day it made CFL bulbs
 * @author MANOJH
 * Date : 26/04/2023
 */
package Assignment2;

import java.util.Scanner;

public class SumOfLedLcd {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.print("LED bulbs :");
		int led = read.nextInt();
		System.out.print("LCD bulbs :");
		int lcd = read.nextInt();
		
		System.out.println("Bulbs altogether :"+(led+lcd));

	}

}
