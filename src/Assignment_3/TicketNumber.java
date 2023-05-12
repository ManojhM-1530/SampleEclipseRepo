/**
 *  There is a group selection in a crowd for an event based on the entry ticket number.
 * @author MANOJH
 * Date: 25/04/2023
 */
package Assignment_3;
import java.util.Scanner;

public class TicketNumber {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int ticketNumber = read.nextInt();
		
		if(ticketNumber%10==0)
			System.out.println("Group Leader");
		else
			System.out.println("Group Member");
	}

}
