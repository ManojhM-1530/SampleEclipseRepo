/**
* Write a program to display a number whose digits are 2 greater than the 
corresponding digits of the number.
* @author MANOJH
* Date : 28/04/2023
*/
package Assignment2;

import java.util.Scanner;

public class IncrementDigits {
	
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		 int number = read.nextInt();
		 int sum=0,i=0;
		 
		 while(number>0){
		       sum += ((number%10) +2)*Math.pow(10,i);
		       i++;
		       number /=10;
		 }
		 System.out.println(sum);
		 
		 read.close();
		}

}

