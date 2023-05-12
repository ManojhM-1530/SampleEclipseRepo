package com.Arrays;

public class TheatreConstructor {

	public static void main(String[] args) {
		
		//Default Constructor
		TheatreDetails theatreCon = new TheatreDetails();
		theatreCon.getTheatreDetails();
		
		//Constructor one Argument
		TheatreDetails theatreCon1 = new TheatreDetails(111);
		theatreCon1.getTheatreDetails();
		
		//Constructor two Argument
		TheatreDetails theatreCon2 = new TheatreDetails(112,"Rohini");
		theatreCon2.getTheatreDetails();
		
		//Constructor two Argument
		TheatreDetails theatreCon3 = new TheatreDetails(113,"APA","Cbe");
		theatreCon3.getTheatreDetails();


	}

}
