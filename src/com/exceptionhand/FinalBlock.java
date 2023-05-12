package com.exceptionhand;

public class FinalBlock {

	public static void main(String[] args) {
		try {
//			String s = null;
//			System.out.println(s.length());
			
			int a[] = new int[10];
			System.out.println(a[10]);
		}
		finally{
			System.out.println("Error Happens..");
		}

	}

}
