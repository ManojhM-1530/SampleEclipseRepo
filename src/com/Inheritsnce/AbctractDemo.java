package com.Inheritsnce;

interface Shape{

	double getArea();
	double getPerimeter();
}

class Circle implements Shape{
	float radius;
	
	public Circle(float radius) {
		this.radius = radius;
	}
	public double getArea(){
		return (Math.PI*radius*radius);
	}
	
	public double getPerimeter() {
		return(2* Math.PI*radius);
	}
}

class Rectangle implements Shape{
	float length,bredth;
	
	public Rectangle(float length,float bredth) {
		this.length = length;
		this.bredth =bredth;
	}
	public double getArea(){
		return (length*bredth);
	}
	
	public double getPerimeter() {
		return(2*(length+bredth));
	}
}

class Square implements Shape{
	float side;
	
	public Square(float side) {
		this.side = side;
	}
	
	public double getArea(){
		return (side*side);
	}
	
	public double getPerimeter() {
		return(4*side);
	}
}

public class AbctractDemo {

	public static void main(String[] args) {
		
		Shape s = new Circle(2.5f);
		System.out.println("Circle Area :"+s.getArea()+" | Circle Perimeter :"+s.getPerimeter());
		
		s = new Rectangle(5,2);
		System.out.println("\nRectangle Area :"+s.getArea()+" | Rectangle Perimeter :"+s.getPerimeter());
		
		s = new Square(4);
		System.out.println("\nSquare Area :"+s.getArea()+" | Square Perimeter :"+s.getPerimeter());
		

	}

}
