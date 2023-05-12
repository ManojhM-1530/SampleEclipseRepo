/**
 * Reverse the array
 * @author MANOJH
 * Date : 26/04/2023
 */

package Assignment3;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int[] array = new int[10];
		int[] array2 = new int[10];
		
		for(int i=0;i<10;i++) {
			array[i]=read.nextInt();
		}
		for(int i=0;i<10;i++) {
			array2[i]=array[10-i-1];
		}
		for(int i=0;i<10;i++) {
			System.out.print(array2[i]+" ");
		}
	}
}
