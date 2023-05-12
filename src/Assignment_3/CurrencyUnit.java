/**
 * The policy followed by a company to process customer orders is given by the following rules
 * @author MANOJH
 * Date: 26/04/2023
 */

package Assignment_3;

import java.util.Scanner;

public class CurrencyUnit {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.print("What is the unit of currency in India?");
		String answer = read.nextLine();
		int t=1;
		while(t<=2) {
			if(t==2) {
				System.out.println("Sorry it is Rupee ");
			}
		}
		
	}
}

//
//if(t==2) {
//	System.out.println("Sorry it is Rupee ");
//	}else {
//	t++;
//	if(answer.equals("Rupee")) {
//		System.out.println("Answer is correct");
//	}
//	else{
//		System.out.println("Try Again!");
//		answer = read.nextLine();
//}					
//}
