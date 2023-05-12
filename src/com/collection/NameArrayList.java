package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class NameArrayList {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		System.out.print("Enter number of Names :");
		int num = read.nextInt();
		
		ArrayList<String> arrayList = new ArrayList<String>(num);
		
		for(int i=0;i<num;i++) {
			System.out.print("Give name "+(i+1)+":");
			arrayList.add(read.next());
		}
		
		Iterator<String> itr = arrayList.iterator();
		while(itr.hasNext())
			if(itr.next().length()<5)
				itr.remove();
		System.out.println(itr.next());
		
//		for(String i :arrayList) {
//			if(i.length()<5)
//				arrayList.remove(i);
//		}
//		System.out.println(arrayList);
	}

}
