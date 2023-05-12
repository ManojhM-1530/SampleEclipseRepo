package com.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;


public class JulieHashMap {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		HashMap<String,Integer> tm = new HashMap();
		
		String name;
		int mark;
		for(int i=0;i<6;i++) {
			System.out.print("Name "+(i+1)+":");
			name = read.next();
			System.out.print("Mark "+(i+1)+":");
			mark = read.nextInt();
			tm.put(name, mark);
		}
		System.out.println(tm);
		Set<Map.Entry<String,Integer>> set = tm.entrySet();
		
		Stack<String> s = new Stack();
		
		for(Map.Entry<String,Integer> set1 : set) {
			if(set1.getValue()>=75) {
				s.push(set1.getKey());
			}
		}
		s.pop();
		System.out.println(s);
		

	}

}
