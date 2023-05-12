package com.collection;

import java.util.*;

public class StackDemo {

	public static void main(String[] args) {
		
		 Stack<String> s = new Stack();
		
		s.push("Arun");
		s.push("Balaji");
		s.push("Chandru");
		s.push("Dany");
		s.push("Esteen");
		s.push("Fizza");
		s.push("Gokul");
		s.push("Hari");
		s.push("Gokul");
		s.push("Hari");
		
		s.pop();
		
				
		Iterator<String> itr = s.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		System.out.println(s.peek());
		System.out.println(s);
	}

}
