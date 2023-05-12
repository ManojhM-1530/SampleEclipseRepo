/**
 * Find the simpleInterest.
 * @author MANOJH
 * Date : 26/04/2023
 */

package Assignment2;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int principleAmount = read.nextInt();
		int rate = read.nextInt();
		int numberOfYears = read.nextInt();
		
		int simpleInterest =principleAmount*rate*numberOfYears;
		
		System.out.println("Simple Interest :"+simpleInterest/100);
		read.close();
	}
}
