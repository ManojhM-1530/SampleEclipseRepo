package com.exceptionhand;

public class FinallyExp {

	public static void main(String[] args) {

		try {
			
			int a[] = new int[10];
			a[10] = 30/0;
			
		}
		catch(NullPointerException e){
			System.out.println(e);
		}
		finally {
			System.out.println("Finally block is always executed.");
		}
		System.out.println("Hiiii");

	}

}
