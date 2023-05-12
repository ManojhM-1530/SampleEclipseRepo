package com.Inheritsnce;

class Vehicle{
	public void run() {
		System.out.println("Inside Vehicle");
	}
}
class Truck extends Vehicle{
	public void run() {
		System.out.println("Inside Truck");
	}
}
class Car extends Truck{
	public void run() {
		System.out.println("Inside Car");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		
		Vehicle vehicle = new Vehicle();
		vehicle.run(); //Base class Run 
		
		vehicle = new Truck();
		vehicle.run(); //Truck class Run 
		
		vehicle = new Car();
		vehicle.run(); //Car class Run 

	}

}
