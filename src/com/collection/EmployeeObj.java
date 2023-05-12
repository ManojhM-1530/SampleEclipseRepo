package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

class Employee{
	private int id;
	private String name;
	public Employee(int id,String name) {
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
	
}

public class EmployeeObj {

	public static void main(String[] args) {
		
		ArrayList<Employee> arrayList = new ArrayList();
		
		arrayList.add(new Employee(1530,"Manojh"));
		arrayList.add(new Employee(123,"Master"));
		
		//System.out.println(arrayList);
		
		Iterator<Employee> itr = arrayList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	
		System.out.println(arrayList);
		
		
	}

}
