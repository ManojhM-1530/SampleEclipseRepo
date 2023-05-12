package com.exceptionhand;

public class ThrowExp {
	
	static void validate(int num) {
		if(num<0)
			throw new ArithmeticException("Negative Number");
		else
			System.out.println("Run");
	}
	
	public static void main(String[] args) {
		try {
			validate(-8);
		}
		catch(Exception e){
			System.out.println(e);
		}

	}

}
