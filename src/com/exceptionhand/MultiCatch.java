package com.exceptionhand;

public class MultiCatch {

	public static void main(String[] args) {
		try {
	
			int a[] = new int[10];
			a[10] = 30/0;
			
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
		catch(Exception e){      // Is a Base class or Generalized class and i must be the end in Exception handling.
			System.out.println(e);
		}
	}

}
