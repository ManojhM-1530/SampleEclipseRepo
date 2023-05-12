package com.StringMethods;

public class TwoStringConditions {

	public static void main(String[] args) {
		String s1 = "criteria";
		String s2 = "it";
		
//		char c1[] = s1.toCharArray();
//		
//		StringBuffer sb = new StringBuffer(" ");
//		
//		for(int i=0;i<c1.length;i++) {
//			if(i%2==0){
//				sb.append(c1[i]);
//			}
//			if(i%2==1) {
//				sb.append(s2);
//			}
//		}
//		
//		System.out.print(sb);
		
		char c2[] = s1.toCharArray();
		StringBuffer sb2 = new StringBuffer(" ");
		if(s1.contains(s2)) {
			int t1 = s1.indexOf(s2);
			int t2 = s1.lastIndexOf(s2);
			if(t1!=t2) {
				
			}
//				t=c2[t2];
//				c2[t2]=c2[t2+1];
//				c2[t2+1]=t;
//			}
		}
		
		for(char x:c2) {
			System.out.print(x);
		}
		
		
		
		
//		char c1[] = s1.toCharArray();
//		
//		String arr[] = new String[2*s1.length()];
//
//		
//		for(int i=0;i<c1.length;i++) {
//			if(i%2==0) {
//				arr[i]=;
//			}
//			if(i%2==1) {
//				c1[i]=;
//			}
//		}
		

	

	}

}
