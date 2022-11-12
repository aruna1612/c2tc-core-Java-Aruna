package hello_world;

public class Fibonacciseries {

	public static void main(String args[]) {
		// TODO Auto-generated constructor stub
		int n = 10, firstTerm = 0, secondTerm = 1;
		System.out.println("Fibonacci Series till " + n + "terms:");
		for (int i = 1; i <= n; ++i) {
			System.out.println(firstTerm + ", ");
			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
	}

}
