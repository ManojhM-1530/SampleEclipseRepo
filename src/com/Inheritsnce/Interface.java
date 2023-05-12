/**
* Design the following interface concept and test the methods of 
Circle and Rectangle.
* @author MANOJH M
* Date : 01/05/2023
*/
package com.Inheritsnce;
import java.util.Scanner;

interface GeometricObject{
	double getArea();
	double getPerimeter();
	}
class Circle1 implements GeometricObject{
	private double radius;
	public Circle1(double radius){
		this.radius = radius;
	}

	public double getArea() {
		return Math.PI*radius*radius;
	}
	public double getPerimeter() {
		return 2*Math.PI*radius;
	}
	public String toString() {
		return "Circle [ Radius : "+radius+" ]";
	}
}
class Rectangle1 implements GeometricObject{
	private double width;
	private double length;
	
	public Rectangle1(double width,double length) {
		this.width =width;
		this.length =length;
	}
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getArea() {
		return width*length;
	}
	public double getPerimeter() {
		return 2*(width*length);
	}
	public String toString() {
		return "Rectangle [ Width : "+width+" | Length : "+length+" ]";
	}
}
public class Interface {
	public static void main(String[] args) {
	Scanner read = new Scanner(System.in);
	
	System.out.print(" Circle Radius :");
	GeometricObject circle = new Circle1(read.nextDouble());
	System.out.println("------------ Circle -------------");
	System.out.println(circle);
	System.out.printf("Area :%.3f\n",circle.getArea());
	System.out.printf("Perimeter :%.3f\n",circle.getPerimeter());
	System.out.println("---------------------------------");
	
	System.out.print("Width :");
	double width = read.nextDouble();
	System.out.print("Length :");
	double length = read.nextDouble();
	GeometricObject rectangle = new Rectangle1(width,length);
	System.out.println("------------ Rectangle -------------");
	System.out.println(rectangle);
	System.out.printf("Area :%.3f\n",rectangle.getArea());
	System.out.printf("Perimeter :%.3f\n",rectangle.getPerimeter());
	System.out.println("------------------------------------");
	read.close();
	}
}