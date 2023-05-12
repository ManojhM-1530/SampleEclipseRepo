package com.encapsulation;

public class Theatre {
	
	private int theatreId;
	private String theatreName;
	private int totalScreen;
	private String theatreLocation;
	
	public int getTheatreId() {
		return theatreId;
	}

	public void setTheatreId(int theatreId) {
		this.theatreId = theatreId;
	}

	public String getTheatreName() {
		return theatreName;
	}

	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}

	public int getTotalScreen() {
		return totalScreen;
	}

	public void setTotalScreen(int totalScreen) {
		this.totalScreen = totalScreen;
	}

	public String getTheatreLocation() {
		return theatreLocation;
	}
	
	public void setTheatreLocation(String theatreLocation) {
		this.theatreLocation = theatreLocation;
	}

	public static void main(String[] args) {
		
		Theatre theatre = new Theatre();
		
		theatre.setTheatreId(123);
		theatre.setTheatreName("PVR");
		theatre.setTotalScreen(10);
		theatre.setTheatreLocation("Chennai");
		
		System.out.println("------Theatre Details-------");
		System.out.println("Theater ID :"+theatre.getTheatreId());
		System.out.println("Theater Name :"+theatre.getTheatreName());
		System.out.println("Theater Total Screen :"+theatre.totalScreen);
		System.out.println("Theater Location :"+theatre.getTheatreLocation());
		
	}

}
