package com.Inheritsnce;

public class MethodOverloadingPoly {
	
	static int add(int first,int second) {
		return first+second;
	}
	static double add(double first,double second) {
		return first+second;
	}
	static char add(char first,char second) {
		return (char)(first+second);
	}
	static String add(String first,String second) {
		return first.concat(second);
	}
	

	public static void main(String[] args) {
		
		System.out.println("Add two Integer :"+add(1,4));
		System.out.println("Add two Double  :"+add(3.505,2.0505500000000003));
		System.out.println("Add two Char    :"+add('9','4'));
		System.out.println("Add two String  :"+add("Mano","jh"));		

	}

}
