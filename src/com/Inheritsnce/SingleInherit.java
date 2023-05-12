package com.Inheritsnce;

// Base class
class Employee{
	int empId;
	String empName;
	
	public void setData(int empId,String empName) {
		this.empId = empId;
		this.empName = empName;
	}
	
	public void getData() {
		System.out.println("Employee Id :"+empId+"\nEmployee Name :"+empName);
	}
}
//Derived class
class Manager extends Employee{
	String empDept;
	
	public void setDept(String empDept) {
		this.empDept =empDept;
	}
	public void getDept() {
		System.out.println("Employee Department : "+empDept);
	}
}


public class SingleInherit {

	public static void main(String[] args) {
		Manager manager = new Manager();
		
		manager.setData(123, "MANOJH");
		manager.getData();
		
		manager.setDept("QA");
		manager.getDept();

	}

}
