package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<Integer> arrayList = new ArrayList();
		
		arrayList.add(10); 
		arrayList.add(12);
		arrayList.add(14);
		arrayList.add(16);
		arrayList.add(18); // Add at the end of list
		
		System.out.println(arrayList);
		
		arrayList.add(1, 50);
		System.out.println(arrayList);
		
		int a[] = {1,2,3,4,5,6};
	
		List<Integer> arrayList1 = new ArrayList();
		arrayList1.add(10);
		arrayList1.add(200);
		arrayList1.add(300);
		
		
		arrayList.addAll(arrayList1);  // Add another collection
		System.out.println(arrayList);
		
		arrayList.remove(3);
		System.out.println(arrayList);  // Remove in ArrayList
		
		System.out.println(arrayList.size()); // Size
		
		if(arrayList.containsAll(arrayList1))  // containsAll
			System.out.println("Present...");
		else
			System.out.println("Absent..");
		
		System.out.println(arrayList.get(2));   // Get the value as per the index.
		
		System.out.println(arrayList.indexOf(10));
		System.out.println(arrayList.lastIndexOf(10));
		arrayList.set(0, 100);
		System.out.println(arrayList);
		
		//arrayList.retainAll(arrayList1);
		
		System.out.println(arrayList);
		System.out.println(arrayList1);
		
		// for..each
//		for(int x:arrayList)
//			System.out.println(x);
		
		//Iterator method
		Iterator itr = arrayList.iterator();
		while(itr.hasNext())
			System.out.print(itr.next()+"-");

		List<Integer> l = arrayList.subList(2, 6);
		System.out.println("\n"+l);
		
		Collections.sort(l);
		System.out.println(l);
		
		//Collections.reverse(arrayList);
		Collections.sort(arrayList,Collections.reverseOrder());
		
		System.out.println(arrayList);
		Collections.rotate(arrayList1, 1);
	}

}
