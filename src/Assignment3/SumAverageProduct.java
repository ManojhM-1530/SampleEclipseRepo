/**
 * Find sum, average and product of an array
 * @author MANOJH
 * Date : 26/04/2023
 */

package Assignment3;

import java.util.Scanner;

public class SumAverageProduct {

	public static void main(String[] args) {
		Scanner read  = new Scanner(System.in);
		
		int[] array = {25,45,20,15,40};
		int sum=0;
		int average;
		int product=1;
		for(int i=0;i<5;i++) {
			sum+=array[i];
			product*=array[i];
		}
		average = sum/5;
		System.out.println(sum+" "+average+" "+product);
				
		read.close();
	}

}
