/**
 * A person has a first name and a last name. Write a main-program that creates an TreeSet and display the sorted result.
 * @author Manojh M
 * Date : 06/05/2023
 */

package com.corejavadeepdrive;
import java.util.*;

class Person implements Comparable<Person>{
	private String firstName;
	private String lastName;
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "-> "+firstName + " " + lastName;
	}
	@Override
	public int compareTo(Person o) {
		
		return this.firstName.compareTo(o.firstName);
	}	
}

public class TreeSetProgram {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		TreeSet<Person> ts = new TreeSet();
		String fName,lName;
		for(int i=0;i<3;i++) {
			System.out.print("Enter FirstName :");
			fName = read.next();
			System.out.print("Enter LastName :");
			lName = read.next();
			ts.add(new Person(fName,lName));
		}
		
		System.out.println("TreeSet Sorted Result :");
		
		Iterator<Person> itr = ts.iterator();
		while(itr.hasNext()) {
			System.out.println("   "+itr.next());
		}
		read.close();	
	}
}
