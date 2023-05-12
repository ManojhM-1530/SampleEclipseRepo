package com.encapsulation;

import java.util.*;

public class Account {
	
	private String id;
	private String name;
	private int balance = 0;
	
	public Account(String id,String name) {
		this.id = id;
		this.name =name;
	}
	public Account(String id,String name,int balance) {
		this.id = id;
		this.name =name;
		this.balance =balance;
	}
	

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	public int credit(double amount) {
		balance+=amount;
		return balance;
	}
	
	public int debit(double amount) {
		if(amount<=balance) {
			balance-=amount;
		}else {
			System.out.println("Amount exceeded balance");
		}
		return balance;
	}
	
	public int transferTo(double amount,Account another) {
		if(amount<=balance) {
			this.balance-= amount;
			another.balance += amount;
		}else{
			System.out.println("Amount exceeded balance");
		}
		
		return balance;
	}
	
	public String toString() {
		return "Account[Id:"+id+", Name :"+name+", Balance :"+balance+"]";
	}
	
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		Account a1 = new Account("1530","Manojh");
		Account a2 = new Account("1234","Murugan");
		
		System.out.println("Welcome...\nChoose your options");
		
		do {
			
			System.out.println("1.Credit  |  2.Debit  |  3.Balance  |  4.Transfer Money  |  5.Exit");
			
			int choice = read.nextInt();
		    switch(choice) {
		    	
		    case 1:
		    	System.out.print("Enter amount :");
		    	a1.credit(read.nextInt());
		    	System.out.println(a1);
		    	break;
		    	
		    	
		    }
			
			
		}while(true);
		
		
		
		

	}

}
