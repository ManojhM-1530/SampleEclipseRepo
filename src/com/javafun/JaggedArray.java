package com.javafun;

public class JaggedArray {     //fixed no. of row with different no. of Columns.
	
	public static void main(String[] args) {
		int bookNo[][] = new int[3][];
		bookNo[0]=new int[] {1,2,3};
		bookNo[1]=new int[] {4};
		bookNo[2]=new int[] {5,6,7,8,9};
		
		for(int i=0;i<bookNo.length;i++) {
			for(int j=0;j<bookNo[i].length;j++) {
				System.out.print(bookNo[i][j]);
			}
			System.out.println();
		}
	}
}
