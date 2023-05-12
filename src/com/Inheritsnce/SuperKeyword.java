package com.Inheritsnce;

class Employee2{
	String name ="Manojh";
	int empId =1111;
	public void displayData() {
		System.out.println("-----Base Class-----");
		System.out.println("Project Leader Name :"+name+"\nEmployee Id :"+empId);
		System.out.println("--------------------");
	}
	Employee2() {
		System.out.println("Base class");
	}
	
}
class ProjectLeader extends Employee2 {
	
	int empId =1530;
	public void displaData() {
		super.displayData(); // super class Method call
		System.out.println("Project Leader Name :"+name+"\nEmployee Id :"+empId);
		System.out.println("-----With Super---------");
		System.out.println("Project Leader Name :"+name+"\nEmployee Id :"+super.empId);
	}
	ProjectLeader() {
		System.out.println("Derived class");
	}
}

public class SuperKeyword {

	public static void main(String[] args) {
		
		ProjectLeader leader = new ProjectLeader();
		leader.displaData();
	}

}
