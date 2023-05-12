/**
 * Sort the array
 * @author MANOJH
 * Date : 26/04/2023
 */

package Assignment3;
import java.util.*;

public class DiceValue {

	public static void main(String[] args) {
		int[] array = new int[10];
		
		for(int i =0;i<10;i++) {
			array[i]=(int)(Math.random()*6)+1;
		}
		for(int x:array) {
			System.out.print(x+" ");
		}
	}
}
