/**
 * 
 */
package hello_world;

/**
 * @author ELCOT
 *
 */
public class swapnumbers {

	/**
	 * 
	 */
	public swapnumbers() {
		
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
         float first = 1.20f, second = 2.45f;
         
         System.out.println("--Before swap--");
         System.out.println("First number = " + first);
         System.out.println("Second number = " + second);
         
         
         float temporary = first;
         first = second;
         second= temporary;
         
         System.out.println("--After swap--");
         System.out.println("First number = " + first);
         System.out.println("Second number = " + second);

	}

         
	}


