/**
 * Check 2 integer and Sum of the integer and implement teen conditions
 * @author MANOJH
 * Date: 25/04/2023
 */
package Assignment_3;

import java.util.Scanner;

public class TeenSum {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int a =read.nextInt();
		int b =read.nextInt();
		
		if(a>=13 && a<=19 || b>=13 && b<=19  ) {    // To check a and b values are in the range of 13-19.
			System.out.println("19");
		}else {
			System.out.println(a+b);
		}
		read.close();
		
	}

}
