package com.collection;

import java.util.*;

class Theatre{
	private String name;
	private String movieName;
	public Theatre(String name, String movieName) {
		super();
		this.name = name;
		this.movieName = movieName;
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
	@Override
	public String toString() {
		return "Theatre [name=" + name + ", movieName=" + movieName + "]";
	}
	
}

public class HashSetDemo {

	public static void main(String[] args) {
//		HashSet<Theatre> hs = new HashSet<Theatre>();
//		hs.add(new Theatre("PVR","LEO"));
//		hs.add(new Theatre("INOX","PS2"));
//		hs.add(new Theatre("PVR","PS"));
//		hs.add(new Theatre("PVR","LEO"));
//		hs.add(new Theatre("INOX","PS2"));
//		hs.add(new Theatre("PVR","PS"));

		HashSet<String> str = new HashSet();
		str.add("Arun");
		str.add("Balaji");
		str.add("Chandru");
		str.add("Dany");
		str.add("Esteen");
		str.add("Fizza");
		str.add("Gokul");
		str.add("Hari");
		str.add("Gokul");
		str.add("Hari");
		
		str.remove("Arun");
		
		System.out.println(str.size());
		
		System.out.println(str.hashCode());
		System.out.println();
		
//		Iterator<Theatre> itr = hs.iterator();
		Iterator<String> itr = str.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}

}
