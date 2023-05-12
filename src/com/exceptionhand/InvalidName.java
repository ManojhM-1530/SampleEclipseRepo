package com.exceptionhand;


class InvalidUsernameException extends Exception{
	public InvalidUsernameException(String m) {
		super(m);
	}
}

public class InvalidName {
	
	public static void checkInvalidUsername(String username) throws InvalidUsernameException{
		int t1=0,t2=0;
			for(int i=0;i<username.length();i++) {
				
				if(username.contains("_") && username.length()>=8) {
					if(username.charAt(i)<=65 && username.charAt(i)>=91)
						t1=1;
					else if( username.charAt(i)<=97 && username.charAt(i)>=123)
						t2=1;
				}
			}
			if(t1==1 && t2==1) {
				System.out.println("Valid User Name");
			}else {
				throw new InvalidUsernameException("Please enter valid username.");
				
			}
		
	}

	public static void main(String[] args) throws InvalidUsernameException {
		
		String username = "Manojh_MT";
		checkInvalidUsername(username);
		
	}

}
