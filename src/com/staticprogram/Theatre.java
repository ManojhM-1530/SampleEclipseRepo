package com.staticprogram;

public class Theatre {
	
	private int theatreId;
	private String movieName;
	static String theatreName;  // create a static variable
	
	static {
		theatreName = "INOX";  // initialization the static Variable
	}
	
	public Theatre() {
		theatreId = 96;
		movieName = "LEO";
	}
	
	public int getTheatreId() {
		return theatreId;
	}
	public String getMovieName() {
		return movieName;
	}
	
	public static void theatreNameChange() {    // create the function for changing the static variable
		theatreName = "PVR";
	}

	public static void main(String[] args) {
		
		Theatre theatreObj = new Theatre();
		System.out.println("Theatre Id :"+theatreObj.getTheatreId()+" | Theatre Name :"+theatreName+" | Movie Name :"+theatreObj.getMovieName());
		
		theatreNameChange();   // call the method
		
		Theatre theatreObj1 = new Theatre();  // call the function
		System.out.println("Theatre Id :"+theatreObj1.getTheatreId()+" | Theatre Name :"+theatreName+" | Movie Name :"+theatreObj1.getMovieName());

	}

}
