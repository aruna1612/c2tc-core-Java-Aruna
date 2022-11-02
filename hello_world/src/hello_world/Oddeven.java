/**
 * 
 */
package hello_world;

import java.util.Scanner;

/**
 * @author ELCOT
 *
 */
public class Oddeven {

	/**
	 * 
	 */
	public Oddeven() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
       Scanner reader = new Scanner(System.in);
       
       System.out.print("Enter a number: ");
       int num = reader.nextInt();
       
       if(num % 2 == 0)
    	   System.out.println(num + " is even");
       else
    	   System.out.println(num + " is odd");
	}
}
		

	
