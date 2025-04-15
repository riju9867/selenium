package methodAndFunction;

public class Swapping 
{

	public static void main(String[] args) {
		int a = 5, b = 10;

		System.out.println("Before swapping:");
		System.out.println("a = " + a + ", b = " + b);

		// Swapping logic without third variable
		a = a + b; // a now becomes 15
		b = a - b; // b now becomes 5 (original value of a)
		a = a - b; // a now becomes 10 (original value of b)

		System.out.println("After swapping:");
		System.out.println("a = " + a + ", b = " + b);
	}
}


