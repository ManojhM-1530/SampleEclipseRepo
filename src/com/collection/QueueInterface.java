package com.collection;

import java.util.*;

class Employe implements Comparator{
	private int id;
	private String name;
	public Employe(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

public class QueueInterface {

	public static void main(String[] args) {
		PriorityQueue<Employe> pq = new PriorityQueue();
//		pq.add("M");
//		pq.add("A");
//		pq.add("N");
//		pq.add("O");
//		pq.add("J");
//		pq.add("H");
//		pq.add("M");
//		pq.add("T");
		
//		System.out.println(pq);
		
		

//		System.out.println(pq);
//		System.out.println(pq.poll());
		
//		pq.peek();
//		System.out.println(pq.peek());
		
		pq.offer(new Employe(123,"Manojh"));
		Iterator<Employe> itr = pq.iterator();
		while(itr.hasNext())
			System.out.print(itr.next()+" ");
		
//		pq.poll();
		  // Insert 

		System.out.println(pq.element());  // throw Exception when PriorityQueue is null.
	

		

	}

}
