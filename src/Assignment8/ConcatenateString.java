/**
 * Concatenate both the strings into a third string “string3” and print the result.
 * @author Manojh M
 * Date :04/05/2023
 */

package Assignment8;

import java.util.Scanner;

public class ConcatenateString {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		String string1 = read.next();	//Read the String1 from User.
		String string2 = read.next(); 	//Read the String2 from User.
		
		String string3 = string1.concat(string2);  // Concatenate string1 and string2.
		
		System.out.println(string3);
		read.close();
		
	}

}
