package com.collection;

import java.util.*;


class Theater{
	private String name;
	private String movieName;
	private String seatNumber;
	public Theater(String name, String movieName, String seatNumber) {
		this.name = name;
		this.movieName = movieName;
		this.seatNumber = seatNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}
	@Override
	public String toString() {
		return "Theater [name=" + name + ", movieName=" + movieName + ", seatNumber=" + seatNumber + "]";
	}
		
}


public class LinkedListDemo {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		LinkedList<Theater> linkedList = new LinkedList();
		
		String name,movieName,seatNumber;
		for(int i=0;i<2;i++) {
			System.out.println("Enter Theater "+(i+1)+" Details.");
			name = read.next();
			movieName = read.next();
			seatNumber = read.next();
			linkedList.add(new Theater(name,movieName,seatNumber));
		}
		
		linkedList.addFirst(new Theater("Pvr","I","A2222"));
		
		
		Iterator<Theater> itr = linkedList.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		read.close();
	}

}
