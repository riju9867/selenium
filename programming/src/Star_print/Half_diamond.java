package Star_print;

public class Half_diamond 
{
	public static void main(String[] args) 
	{
		int n = 7, st = 1;
		for (int i = 1; i <= n; i++) 
		{
			// Print leading spaces
			for (int j = 1; j <= n - i; j++)
				System.out.print(" ");

			// Print stars
			for (int k = 1; k <= st; k++)
				System.out.print("*");

			st = st+2; // Increase stars by 2
			System.out.println(); // New line after each row
		}
	}
}
