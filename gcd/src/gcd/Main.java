/**
 * 
 */
package gcd;

/**
 * @author ELCOT
 *
 */
public class Main {

	/**
	 * 
	 */
	public Main() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 81, n2 = 153;
		int gcd = 1; 
		for (int i = 1; i<= n1 && i <= n2; ++i) {
			if (n1 % i == 0 && n2 % i == 0)
				gcd = i;
		}
		System.out.println("GCD of " + n1 +" and " + n2 + " is " + gcd);
	}
}
			
	
 