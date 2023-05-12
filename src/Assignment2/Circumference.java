/**
 * Find the Circumference.
 * @author MANOJH
 * Date : 26/04/2023
 */

package Assignment2;

import java.util.Scanner;

public class Circumference {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.print("Diameter :");		
		int D = read.nextInt();
		int circumference = (int)(2*3.14*(D/2));
		
		System.out.println("Circumference :"+circumference);
		

	}

}
