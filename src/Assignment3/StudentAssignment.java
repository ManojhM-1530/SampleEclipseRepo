package Assignment3;

import java.util.Scanner;

public class StudentAssignment {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int array[] = new int[10];
		
		for(int i=0;i<array.length;i++) {
			array[i] = read.nextInt();
		}
		
		for(int i=0;i<array.length;i++) {
			if(array[i]<40) {
				System.out.print(i);
			}
		}
		
		read.close();

	}

}
