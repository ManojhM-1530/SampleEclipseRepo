package com.exceptionhand;

class InvalidAgeException extends Exception{  //Creating Own Exception
	public InvalidAgeException(String m) {
		super(m);
	}
}

public class UserDefinedExp {
	
	public static void checkVoteEligible(int age)throws InvalidAgeException{
		if(age<18)
			throw new InvalidAgeException("Wait for "+(18-age)+" years to vote.");  // again throwing the exception.
		else
			System.out.println("You can vote...");
	}

	public static void main(String[] args) throws InvalidAgeException{  // throws for using try catch block.
		int age = 12; 
//		try {                            // by using try Catch block
			checkVoteEligible(age);
//		}
//		catch(InvalidAgeException e) {
//			System.out.println(e);
//			e.printStackTrace();
//		}
		

	}

}
