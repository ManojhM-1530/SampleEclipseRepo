/**
 * Check the ticket number tell him/her that they are a group leader or a group member.
 * @author MANOJH
 * Date: 25/04/2023
 */

package Assignment_3;

import java.util.Scanner;

public class IncreasingDecreasing {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int number1 = read.nextInt();
		int number2 = read.nextInt();
		int number3 = read.nextInt();
		
		if(number1 > number2 && number2 > number3)
			System.out.println("Decreasing order");
		else if(number1 < number2 && number2 < number3)
			System.out.println("Increasing order");
		else
			System.out.println("Neither increasing nor decreasing");
		read.close();
	}

}
