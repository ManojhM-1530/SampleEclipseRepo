/**
 * Read age and check eligible to vote or not
 * @author MANOJH
 * Date : 26/04/2023
 */

package Assignment4;

import java.util.Scanner;

public class VotingEligible {
	
	public static void isEligible(int age) {
		if(age>=18) 
			System.out.println("Eligible to vote.");
		else
			System.out.println("Not Eligible to vote.");
	}
	
	public static boolean isValidAge(int age) {
		if(age>=1)
			return true;
		else
			return false;
		
	}

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int age = read.nextInt();
		
		if(isValidAge(age))
			isEligible(age);
		else
			System.out.println("Enter valid age.");
		
		read.close();
	}

}
