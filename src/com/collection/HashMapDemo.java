package com.collection;

import java.util.*;

class School{
	private int id;
	private String name;
	public School(int id, String name) {
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
		return "School [id=" + id + ", name=" + name + "]";
	}
	
}

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer,String> tm = new HashMap<Integer,String>();
		
		tm.put(123, "Manojh");
		tm.put(125, "Man");
		tm.put(126, "Ma");
		tm.put(124, "Mano");
		
		
		System.out.println(tm);
		
		Set<Map.Entry<Integer, String>> set = tm.entrySet();
		
		for(Map.Entry<Integer, String> set1 : set) {
			System.out.print(set1.getKey()+"-");
			System.out.println(set1.getValue());
		}
			
		System.out.println(tm.get(123));
		
		tm.remove(126);
		
		tm.replace(124, "Master");
		
		System.out.println(tm);
		System.out.println(tm.containsKey(123));
		System.out.println(tm.containsValue("Man"));
		
		
		

	}

}
