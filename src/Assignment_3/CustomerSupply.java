/**
 * The policy followed by a company to process customer orders is given by the following rules
 * @author MANOJH
 * Date: 26/04/2023
 */

package Assignment_3;

import java.util.Scanner;

public class CustomerSupply {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int stock = read.nextInt();
		int customerOrder = read.nextInt();
		char credits = read.next().charAt(0);
		
		if(credits=='N') {
			if(customerOrder>stock) {
				System.out.println(stock+" supplied.Out of stock. Balance will be refunded. ");
			}else
				System.out.println(customerOrder+" supplied");
		}else
			System.out.println("Cannot supply ");
	}
}
