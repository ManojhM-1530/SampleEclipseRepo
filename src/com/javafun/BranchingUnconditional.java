package com.javafun;

public class BranchingUnconditional {

	public static void main(String[] args) {
		
		int counter=5;
		for(int i=1;i<=10;i++) {
			System.out.println("PREMIUM Seat Available : "+counter);
			if(i==5) {
				System.out.println("All Premium Seats are Filled");
				break;
			}
			counter--;
					
		}
		System.out.println("All VIP Seats are 6-10 are Reserved");

	}

}
