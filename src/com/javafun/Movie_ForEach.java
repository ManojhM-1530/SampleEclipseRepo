/**
 * Print the movie name based on Genre using ForEach loop 
 * @author MANOJH
 * Date: 25/04/2023
 */

package com.javafun;

import java.util.Scanner;

public class Movie_ForEach {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		String movieName[] = {"BEAST","PS1","PS2","LEO"} ;
		String movieGenre[] = {"ACTION","HISTORIC","HISTORIC","LCU"};
		
		String genre = read.next();
		int counter=0;
		
		for(String i:movieGenre)  {
			
			if(i.equals(genre)) {
				System.out.println(movieName[counter]);
			}
			counter++;
		}
		read.close();
	

	}

}
