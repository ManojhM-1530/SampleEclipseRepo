package com.collection;

import java.util.*;
import java.util.TreeSet;

class Employee1 implements Comparator<Employee1>{
	private int id;
	private String name;
	public Employee1(int id,String name) {
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
		return "Employee [Id = " + id + ", Name = " + name + "]";
	}
	@Override
	public int compare(Employee1 o1, Employee1 o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}



public class TreeSetCustom {

	public static void main(String[] args) {

		TreeSet<Employee> ts = new TreeSet();
		
		ts.add(new Employee(123,"Manojh"));
		ts.add(new Employee(123,"Manojh"));
		
		System.out.println(ts);
		

	}

}
