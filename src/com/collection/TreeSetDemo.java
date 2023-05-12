package com.collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {


		TreeSet<String> ts = new TreeSet();
		
		ts.add("Esteen");
		ts.add("Fizza");
		ts.add("Gokul");
		ts.add("Hari");
		ts.add("Imran");
		ts.add("Arun");
		ts.add("Balaji");
		ts.add("Chandru");
		ts.add("Dany");
		
		
//		ts.remove("Hari");
//		
//		
//			
//		Iterator<String> itr = ts.iterator();
//		while(itr.hasNext())
//			System.out.println(itr.next());
//		
//		System.out.println(ts);
//		
//		System.out.println(ts.getClass());
//		
		System.out.println(ts.tailSet("Dany"));
//		
//		System.out.println(ts.subSet("Balaji", "Gokul"));
		
		System.out.println(ts.pollFirst());
		
		System.out.println(ts.pollLast());
		
		ts.add("HIII");
		System.out.println(ts);
		
		
		Iterator<String> itr = ts.descendingIterator();  //Reverse 
		
		while(itr.hasNext())
			System.out.println(itr.next());
		
		System.out.println(ts.size());
		
		ts.isEmpty();
		

	}

}
