/**
 * Find Maximum and Minimum values form array
 * @author MANOJH
 * Date : 26/04/2023
 */

package Assignment3;

import java.util.Scanner;

public class MaximumMinimumValue {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int num = read.nextInt();
		int[] array = new int[num];
		
		for(int i=0;i<num;i++) {
			array[i]=read.nextInt();
		}
		int maximum=array[0];
		int minimum=array[0];
		
		for(int i=0;i<num;i++) {
			if(array[i]>maximum) {
				maximum = array[i];
			}
			if(array[i]<minimum) {
				minimum = array[i];
			}
		}
		System.out.println(maximum+" "+minimum);
		read.close();

	}

}
