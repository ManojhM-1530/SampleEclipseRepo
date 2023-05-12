package com.StringMethods;


public class CountTimes {

	public static void main(String[] args) {

		String s = "malayalam";
		
		char a[] = s.toCharArray();
		//Arrays.sort(a);
		
		for(int i=0;i<a.length;i++) {
			int c=0;
			for(int j=i;j<a.length;j++) {
				if(a[i]==a[j]) {
					c++;
				}
				
			}
			System.out.println(a[i]+"-"+c);
		}
		

	}

}
