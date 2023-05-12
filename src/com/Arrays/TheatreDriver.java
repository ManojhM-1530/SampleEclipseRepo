/**
 * Theatre Details using array of object.
 * @author MANOJH
 * Date : 26/04/2023
 */

package com.Arrays;

import java.util.Scanner;

class TheatreDetails {
	
	private int theatreId;
	private String theatreName;
	private String theatreLocation;
	
	
	//Default Constructor
	public TheatreDetails(){
		theatreId = 123;
		theatreName ="RAM";
		theatreLocation ="Chennai";
	}
	// Constructor one perameter
	public TheatreDetails(int theatreId) {
		this.theatreId = theatreId;
	}
	// Constructor two perameter
	public TheatreDetails(int theatreId,String theatreName) {
		this.theatreId = theatreId;
		this.theatreName = theatreName;
	}
	// Constructor three perameter
	public TheatreDetails(int theatreId,String theatreName, String theatreLocation) {
		this.theatreId = theatreId;
		this.theatreName = theatreName;
		this.theatreLocation = theatreLocation;
	}
	
//	public void setTheatreDetails(int theatreid,String theatrename,String theatrelocation) {
//		theatreId = theatreid;
//		theatreName = theatrename;
//		theatreLocation = theatrelocation;
//	}
	public void getTheatreDetails() {
		System.out.println("Theatre Id :"+theatreId+"\nTheatre Name :"+theatreName+"\nTheatre Location :"+theatreLocation);
	}
}

public class TheatreDriver{
	
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int theatreId;
		String theatreName,theatreLocation;
		
		 TheatreDetails[] theatre = new TheatreDetails[3];
		 
		 
		 //Creating theater Array Objects
		 for(int i=0;i<2;i++) {
			 theatre[i] = new TheatreDetails();
		 }
		 
		 //Assign value to the Object
		 for(int i=0;i<2;i++) {
			 System.out.println("-----Enter Theatre "+(i+1)+" Details-----");
			 System.out.print("Enter theatre Id :");
			 theatreId = read.nextInt();
			 System.out.print("Enter theatre Name :");
			 theatreName = read.nextLine();
			 read.next();
			 System.out.print("Enter theatre Location :");
			 theatreLocation = read.next();
			
			 //theatre[i].setTheatreDetails(theatreId, theatreName, theatreLocation);
		 }
		 
		 for(int i=0;i<2;i++) {
			 theatre[i].getTheatreDetails();
		 }
		 read.close();
		 

	}
}

