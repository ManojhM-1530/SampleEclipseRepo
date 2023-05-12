/**
 * Design the circle as a given UML diagram.
 * @author MANOJH
 * Date: 26/04/2023
 */

package com.encapsulation;

import java.util.Scanner;

public class Circle {
	
	private double radius = 1.0;
	private String color = "red";
	
	//Default Constructor methods
	public Circle() {
		
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public Circle(double radius,String color) {
		this.radius = radius;
		this.color = color;
	}
	
	// Setters and Getters methods
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getRadius() {
		return radius;
	}
	public String getColor() {
		return color;
	}
	
	// Method Get area of circle
	
	public double getArea() {
		return (Math.PI*radius*radius);
	}
	
	// toString method
	
	public String toString() {
		return "Circle[Radius :"+radius+" | "+"color :"+color+" | "+"Area :"+getArea()+"]";
	}
	
	
	public static void main(String[] args) {
		
		Circle circle1,circle2,circle3,circle4;
		
		circle1 = new Circle();
		System.out.println("--------- Circle 1 Area ----------");
		System.out.println(circle1);
		System.out.println("----------------------------------");
		
		Scanner read = new Scanner(System.in);
		System.out.print("Radius :");
		circle2 = new Circle(read.nextDouble());
		System.out.println("--------- Circle 2 Area ----------");
		System.out.println(circle2);
		System.out.println("----------------------------------");
		
		System.out.print("Radius :");
		double radius = read.nextDouble();
		System.out.print("color :");
		String color = read.next();
		circle3 = new Circle(radius,color);
		System.out.println("--------- Circle 3 Area ----------");
		System.out.println(circle3);
		System.out.println("----------------------------------");
		
		System.out.print("Radius :");
		double radiuss = read.nextDouble();
		System.out.print("Color :");
		String colour = read.next();
		circle4 = new Circle(radiuss,colour);
		System.out.println("--------- Circle 4 Area ----------");
		System.out.println(circle4);
		System.out.println("----------------------------------");
		read.close();
		
	}

}
