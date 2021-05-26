
public class BasicRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Print Factorial
		System.out.println(factorial(5));
		
		//Print Fibonacci Sequence
		System.out.println(fibonacci(7));
		
	}

	//Factorial Recursion
	//5! = 5*4*3*2*1 = 120
	public static int factorial(int n) {
		if(n==1) {
			System.out.println("Factorial(" + n + ") = 1");
			return 1;
		} else {
			System.out.println("Factorial (" + n + ") = " + n + " * factorial (" + (n - 1) + ")");
			return n * factorial(n-1);
		}
	}
		
	//Fibonacci Sequence
	// 0 1 1 2 3 5 8...
	public static int fibonacci(int n) {
		if(n>=3) {
			return fibonacci(n-1) + fibonacci(n-2);
		} else {
			return 1;
		}
	}
		
	
	
}
