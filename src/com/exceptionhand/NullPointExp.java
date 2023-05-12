package com.exceptionhand;

public class NullPointExp {

	public static void main(String[] args) {
		
		try {
//			String s = null;
//			System.out.println(s.length());
			
			int a[] = new int[10];
			System.out.println(a[10]);
		}
		catch(Exception e){
			//System.out.println(e);
			e.printStackTrace();
		}
		
		System.out.println("rest of the code");   // It will not run without try catch block if exception occure.

	}

}


/*
 *   e.printStackTrace();
 */
