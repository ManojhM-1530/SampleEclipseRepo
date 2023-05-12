package com.Inheritsnce;

class Person{
	String name;
	int age;
	
	public void setPerData(String name,int age) {
		this.name =name;
		this.age = age;
	}
	public void getPerData() {
		System.out.println("Employee Name :"+name+"\nEmployee Age :"+age);
	}
}
class Employee1 extends Person{
	int empId;
	
	public void setEmpData(int empId) {
		this.empId = empId;
	}
	
	public void getEmpData() {
		System.out.println("Employee Id :"+empId);
	}
}
class Manager1 extends Employee1{
	String empDept;
	
	public void setDept(String empDept) {
		this.empDept =empDept;
	}
	public void getDept() {
		System.out.println("Employee Department : "+empDept);
	}
}

public class MultiLevelInher {
	

	public static void main(String[] args) {
		Manager1 manager = new Manager1();
		manager.setPerData("Manojh", 21);
		manager.setEmpData(1530);
		manager.setDept("QA");
		manager.getPerData();
		manager.getEmpData();
		manager.getDept();

	}

}




