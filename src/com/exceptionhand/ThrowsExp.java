package com.exceptionhand;

public class ThrowsExp {
	
	static void fun() throws IllegalAccessException{
		System.out.println("Inside fun()");
		throw new IllegalAccessException();
	}

	public static void main(String[] args) {
		
		try {
			fun();
		}
		catch(IllegalAccessException e){
			System.out.println("main class");
		}

	}

}
// final block will execute always