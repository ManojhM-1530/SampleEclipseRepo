package com.lamda;


interface Message{
	public abstract int add(int a,int b);
}

public class LamdaExpressionDemo {

	public static void main(String[] args) {
		
		Message m = (a,b)->(a+b);
		
		System.out.println(m.add(-1, -5));
		
		System.out.println(m.add(5, 5));

	}

}
