/**
 * Create a Collection called HashMap which is capable of storing String objects. 
 * @author Manojh M
 * Date : 06/05/2023
 */

package com.corejavadeepdrive;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class HashMapProgram {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		HashMap<Integer,String> hm = new HashMap();
		
		int id;
		String name;
		
		for(int i=0;i<5;i++) {
			System.out.print("Enter Id "+(i+1)+" :");
			id = read.nextInt();
			System.out.print("Enter Name "+(i+1)+" :");
			name = read.next();
			hm.put(id,name);
		}
		System.out.print("Enter the Key :");
		
		if(hm.get(read.nextInt())!=null)
			System.out.println("	Particular key exists");
		else
			System.out.println("	Particular key not exists");
			
		for(Map.Entry<Integer,String> map : hm.entrySet()) {
			
			System.out.print("Enter the Value :");
			
			if(map.getValue().equals(read.next())) {
				System.out.println("	Particular value exists");
				break;
			}else {
				System.out.println("	particular value not exists");
				break;
			}
		}
		
		Iterator<Integer> itr = hm.keySet().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		read.close();

	}

}
