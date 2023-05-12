/**
 * use without return and with perameters
 * @author MANOJH M
 * Date 26/04/2023
 */

package com.functioncodes;

import java.util.Scanner;

public class MovieTicket {
	 
	public static void MovieDetails(String movieTitle,String movieDescription,int movieDuration,String movieLanguage,String releaseDate,String movieCountry,String movieGenre) {
		System.out.println("-----Movie Details-------");
		System.out.println("Movie Title :"+movieTitle);
		System.out.println("Movie Description :"+movieDescription);
		System.out.println("Movie Duration :"+movieDuration);
		System.out.println("Movie Language :"+movieLanguage);
		System.out.println("Movie ReleaseDate :"+releaseDate);
		System.out.println("Movie Country :"+movieCountry);
		System.out.println("Movie Genre :"+movieGenre);
		System.out.println("-------------------------");
		
		
	}

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.print("Movie Title :");
		String movieTitle = read.next();
		System.out.print("Movie Description :");
		String movieDescription = read.next();
		System.out.print("Movie Duration :");
		int movieDuration = read.nextInt();
		System.out.print("Movie Language :");
		String movieLanguage = read.next();
		System.out.print("Movie releaseDatel :");
		String releaseDatel = read.next();
		System.out.print("Movie Country :");
		String movieCountry = read.next();
		System.out.print("Movie Genre :");
		String movieGenre = read.next();
		MovieDetails(movieTitle,movieDescription,movieDuration,movieLanguage,releaseDatel,movieCountry,movieGenre);
		

	}

}
