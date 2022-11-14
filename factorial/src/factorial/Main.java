package factorial;

public class Main {

	public  static void main(String args[]) {
		// TODO Auto-generated constructor stub
		int num = 10;
		long factorial = 1;
		for(int i = 1; i <= num; ++i)
		{
			factorial *= i;
		}
		System.out.printf("Factorial of %d = %d", num, factorial);
	}
}
