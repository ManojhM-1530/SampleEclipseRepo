	/**
	 * Initialize an integer variable display the same
	 * @Author MANOJH M
	 * Date: 25/05/2023
	*/

package com.javafun;

import java.util.Scanner;

public class Arrays_length {

		public static void main(String[] args) {
		    int[] number;
		    number =new int[10];
		    Scanner read = new Scanner(System.in);
			for(int i=0;i<10;i++){
			    number[i]=read.nextInt();
			}
			System.out.println(number.length);
		}

}
